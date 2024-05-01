class Animal
{}
class Dog extends Animal{}
public class InstanceOf {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
    }
}
