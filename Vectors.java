import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<Integer>();
        obj.add(2);
        obj.add(8);
        obj.add(10);
        System.out.println("First Element: "+obj.firstElement());
        System.out.println("Last Element: "+obj.lastElement());
        System.out.println("Size: "+obj.size());
        obj.removeAllElements();
        System.out.println("Size after removing all elements: "+obj.size());

    }
}
