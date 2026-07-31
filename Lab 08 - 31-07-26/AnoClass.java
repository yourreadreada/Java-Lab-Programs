public class AnoClass
{
    public static void main(String[] args)
    {
        Animal a = new Animal()
        {
            void dis()
            {
                super.dis();
                System.out.println("Hello From Anonymous Class");
            }
        };
        a.dis();
    }
}

class Animal
{
    void dis()
    {
        System.out.println("In Animal Class");
    }
}