import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling 
{
    public static void main(String args[]) 
    {
        try
        {
            // Writing to the file
            FileWriter writer=new FileWriter("data.txt");
            writer.write("Welcome To Java File Handling");
            writer.write("This is an example of writing and reading a file.");
            writer.close();

            // Reading from the file
            FileReader reader=new FileReader("data.txt");
            int ch;
            System.out.println("Contents of the file:");
            while((ch = reader.read()) != -1)
            {
                System.out.println((char) ch);
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println("Error Occured: "+e.getMessage());
        }
    }   
}