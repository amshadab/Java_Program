package Multithreading;

public class ThreadCommunication {
    private int value = 0;
    private boolean isData = false;

    // Producer method
    public synchronized void producer() {
        for(int i=0;i<10;i++) { // Continuous loop
            while (isData) { // If data is already produced, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            value++; // Produce new data
            System.out.println("Produced: " + value);
            isData = true; // Mark that data is available
            notify(); // Notify the consumer
        }
    }

    // Consumer method
    public synchronized void consumer() {
        for(int i=0;i<10;i++) { // Continuous loop
            while (!isData) { // If no data is available, wait
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Consumed: " + value); // Consume the data
            isData = false; // Mark that data has been consumed
            notify(); // Notify the producer
        }
    }

    public static void main(String[] args) {
        ThreadCommunication threadCommunication = new ThreadCommunication();

        // Producer thread
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                threadCommunication.producer();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                threadCommunication.consumer();
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();
    }
}
