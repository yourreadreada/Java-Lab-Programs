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

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat Meows");
    }
}

public class HierarchicalInheritance
{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.eat();
        d.bark();

        Cat c=new Cat();
        c.eat();
        c.meow();

        // Cat c=new Dog(); // Error, as Dog and Cat are not related

        Animal ac=new Cat(); // Polymorphism
        ac.eat();
        // ac.meow(); // Error, as Animal does not know meow.
    }
}