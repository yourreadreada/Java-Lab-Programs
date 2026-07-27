import java.util.ArrayList;
public class ArrayListProg
{
    public static void main(String args[])
    {
        ArrayList<String> breakfast = new ArrayList<>();
        breakfast.add("Idli");
        breakfast.add("Vada");
        breakfast.add("Dosa");
        breakfast.add("Uttapa");

        System.out.println("Breakfast: "+breakfast);
        System.out.println("Size = "+breakfast.size());
        breakfast.remove("Uttapa");
        System.out.println("New Breakfast: "+breakfast);
        System.out.println("Size = "+breakfast.size());
        System.out.println("Contains Dosa? "+breakfast.contains("Dosa"));
        breakfast.clear();
        System.out.println("Empty List: "+breakfast);
    }
}