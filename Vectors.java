import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> obj = new Vector<Integer>();
        obj.add(2);
        obj.add(8);
        obj.add(10);
        System.out.println("First Element: "+obj.firstElement());
        System.out.println("Last Element: "+obj.lastElement());
        System.out.println("Capacity: "+obj.capacity());
        obj.addElement(25);
        System.out.println("After adding new element: "+obj);
        System.out.println("Size: "+obj.size());
        obj.removeAllElements();
        System.out.println("After removing all elements: "+obj);

    }
}
