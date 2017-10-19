
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class CopyFile
{

    public static void main(String[] args)
    {
        String input = "";
        try
        {
            File f = new File("t.txt");
            Scanner sc = new Scanner(f);
            input = sc.nextLine();
            File n = new File("x.txt");
            PrintWriter fw = new PrintWriter(n);
            fw.write(input);
            fw.close();
            System.out.println("value :"+input);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

