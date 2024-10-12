package Multithreading;

public class Synchronization extends Thread{
    private World world;
    public Synchronization(World world){
        this.world=world;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            world.increament();

        }
    }
}
