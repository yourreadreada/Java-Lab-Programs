abstract class Shape
{
    abstract void draw(); // Abstract method
    void message()
    {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape{
    void draw()
    {
        System.out.println("Drawing a circle");
    }

    // // Still executes if main method is created in the same class itself.
    // public static void main(String args[])
    // {
    //     Shape s=new Circle();
    //     s.draw();
    //     s.message();
    // }
}

public class Abstract 
{
    public static void main(String args[])
    {
        Shape s=new Circle();
        s.draw();
        s.message();
    }
}
