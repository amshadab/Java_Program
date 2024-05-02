class MyThread extends Thread
{
    public void run()
    {
        System.out.println("My thread");
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        System.out.println("t1 Priority: "+t1.getPriority());
        System.out.println("t2 Priority: "+t2.getPriority());
        System.out.println("t3 Priority: "+t3.getPriority());
        
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);

        System.out.println("t1 Priority: "+t1.getPriority());
        System.out.println("t2 Priority: "+t2.getPriority());
        System.out.println("t3 Priority: "+t3.getPriority());
        
    
    }
}
