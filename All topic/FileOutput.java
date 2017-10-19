
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class FileOutput
{

    public static void main(String[] args)
    {

        try
        {
            File f = new File("t.txt");
            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter(f);
            for (int i = 0; i < 5; i++)
            {
                String input = sc.nextLine();
                fw.write(input+" ");
                System.out.println(input);
            }
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
