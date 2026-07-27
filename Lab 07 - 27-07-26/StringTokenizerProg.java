import java.util.StringTokenizer;
public class StringTokenizerProg
{
    public static void main(String args[])
    {
        String s="Idli,Vada,Dosa,Uttapa";
        StringTokenizer st=new StringTokenizer(s,",");

        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }

        // Functions: hasMoreTokens(), nextToken(), countTokens()
    }
}