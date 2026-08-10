class Animal
{
    void eat()
    {
        System.out.println("This animal eats food");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog Barks");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();
        d.bark();
        Animal a = new Dog();
        a.eat();
    }
}
