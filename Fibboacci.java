public class Fibboacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
     for(int i=0;i<5;i++)
     {
         c=a+b;
         System.out.print(c+"\t");
        a=b;
        b=c;
     }
    }
}
