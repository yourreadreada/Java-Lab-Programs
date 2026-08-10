interface Animal
{
    void sound(); // Abstract Method - method with only signature, no body.
}

class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample
{
    public static void main(String args[])
    {
        Animal a=new Dog();
        a.sound();
    }
}