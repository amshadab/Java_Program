package Multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
       World world = new World();
       Synchronization t1 = new Synchronization(world);
       Synchronization t2 = new Synchronization(world);

       t1.start();
       t1.join();
       t2.start();
       t2.join();
       System.out.println(world.getCount());





    }
}
