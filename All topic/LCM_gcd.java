import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class LCM_gcd
{
  public static int p(int a,int b)
  {
      if(b==0) return a;
      else return p(b,a%b);
  };
    public static void main(String[] args)
    {
        try
        {
            File f = new File("t.txt");
            File n = new File("x.txt");
            PrintWriter fw = new PrintWriter(n);
            Scanner sc = new Scanner(f);
            while(sc.hasNext())
            {
             int a=sc.nextInt();
             int b=sc.nextInt();
             int x=p(a,b);
             fw.write(x+" ");
            System.out.println("value :"+x);
            }
            fw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}


