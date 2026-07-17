public class MethodOverriding
{
    static int count;
    int a=0;

    MethodOverriding() // Default Constructor
    {
        a=1;
        count++;
    }

    MethodOverriding(int b) // Parameterized Constructor
    {
        a=b;
        count++;
    }
    
    public void show()
    {
        System.out.println("a: "+a);
        System.out.println("count: "+count);
    }

    public void show(int c)
    {
        System.out.println("a: "+a);
        System.out.println("c: "+c);
        System.out.println("count: "+count);
    }
    
    public static void main(String args[])
    {
        MethodOverriding mo1 = new MethodOverriding();
        mo1.show();
        MethodOverriding mo2 = new MethodOverriding(3);
        mo2.show(7);
    }
}