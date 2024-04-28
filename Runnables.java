class Even implements Runnable{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even: "+i);
            }
        }
    }
}
class Odd implements Runnable{
   public void run()
    {
        for(int i=1;i<=10;i++)
        {
            if(i%2!=0)
            {
                System.out.println("Odd: "+i);
            }
        }
    }
}
public class Runnables {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        Thread obj1 = new Thread(e);
        Thread obj2 = new Thread(o);
        obj1.start();
        obj2.start();
       
    }
}
