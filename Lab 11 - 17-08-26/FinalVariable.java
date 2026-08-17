class FinalVariableExample
{
    final int max=100;
    void display()
    {
        System.out.println("Max Value: "+max);
    }
}
public class FinalVariable 
{
    public static void main(String args[])
    {
        FinalVariableExample obj=new FinalVariableExample();
        obj.display();
    }   
}
