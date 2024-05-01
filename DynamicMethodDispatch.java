class Animal
{
    public void sound()
    {
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    public void sound()
    {
        System.out.println("Dog bark");
    }
}
class Cat extends Animal{
    public void sound()
    {
        System.out.println("Cat meow");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
