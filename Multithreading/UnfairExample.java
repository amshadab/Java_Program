package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairExample {
    private final Lock lock = new ReentrantLock();
    public void access(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName()+" is acessed");
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println(Thread.currentThread().getName()+" is released");
            lock.unlock();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        UnfairExample uf = new UnfairExample();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                uf.access();
            }
        };

        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");
        Thread t3 = new Thread(runnable,"t3");
        t1.start();
        t2.start();
        t3.start();


    }
}
