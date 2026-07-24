public class UnboxNarrow
{
    public static void main(String args[])
    {
        Double obj=25.75;
        int x=obj.intValue();
        // This will give error as we are converting Double wrapper object to int primitive type: int x=(int) obj;
        System.out.println(x);
    }
}