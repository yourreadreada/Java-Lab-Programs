// Outer class
class Outer
{
    private String message = "Hello from outer class";

    // Inner Class
    class Inner
    {
        void display()
        {
            System.out.println("Message: "+message);
        }
    }
}

// Normal Class
class Animal
{
    void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

public class InnerClass
{
    public static void main(String args[])
    {
        Outer obj=new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();

        Animal dog = new Animal();
        dog.sound();
    }
}