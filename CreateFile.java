import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile
{
    public static void main(String[] args)
    {
        try 
        {
            File file = new File("D:Demo.txt");
            if (file.createNewFile()) {
                System.out.println("The File is created: " + file.getName());
            } else {
                System.out.println("This File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
