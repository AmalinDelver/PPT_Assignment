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
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}