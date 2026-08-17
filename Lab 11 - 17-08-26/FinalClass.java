final class FinalClassExample
{
    void display()
    {
        System.out.println("This is a final class");
    }
}

// class SubClass extends FinalClassExample {} // Compilation error if attempted

public class FinalClass 
{
    public static void main(String agrs[])
    {
        FinalClassExample obj=new FinalClassExample();
        obj.display();
    }
}
