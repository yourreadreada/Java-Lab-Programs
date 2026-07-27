public class StringBufferProg
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Hello");
        System.out.println(sb);

        sb.append("World");
        System.out.println("After Append: "+sb);

        sb.insert(10, "Java");
        System.out.println("After Insert: "+sb);

        sb.replace(0, 10, "Hi");
        System.out.println("After Replace: "+sb);

        sb.delete(2, 6);
        System.out.println("After Delete: "+sb);

        sb.reverse();
        System.out.println("After Reverse: "+sb);

        // Functions: append(), insert(), replace(), delete(), reverse()
    }
}