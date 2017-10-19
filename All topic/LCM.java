import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class LCM
{
  public static int p(int a,int b,int x)
  {
       int lcm=(a*b)/x;
       return lcm;
  }
    public static void main(String[] args)
    {
        try
        {
            File f = new File("gcd.txt");
            File n = new File("lcm.txt");
            PrintWriter fw = new PrintWriter(n);/// FileWriter
            Scanner sc = new Scanner(f);
            while(sc.hasNext())
            {
             int a=sc.nextInt();
             int b=sc.nextInt();
             int x=sc.nextInt();
             int y=p(a,b,x);
             fw.write(y+" ");
            System.out.println("lcm :"+y);
            }
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}



