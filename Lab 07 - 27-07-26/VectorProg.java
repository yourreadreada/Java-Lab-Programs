import java.util.Vector;
public class VectorProg
{
    public static void main(String args[])
    {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("numbers: "+numbers);
        System.out.println("Size = "+numbers.size());
        numbers.remove(4);
        System.out.println("New numbers: "+numbers);
        System.out.println("Size = "+numbers.size());
        System.out.println("Contains 10? "+numbers.contains(10));
        numbers.clear();
        System.out.println("Empty List: "+numbers);
    }
}