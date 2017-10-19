import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class Equation
{

    public static void main(String[] args)
    {
        try
        {
            File f = new File("eq.txt");
            File n = new File("ans.txt");
            PrintWriter fw = new PrintWriter(n);/// FileWriter
            Scanner sc = new Scanner(f);
            while(sc.hasNext())
            {
                double a=sc.nextDouble();
                double b=sc.nextDouble();
                double c=sc.nextDouble();

               double  d = b * b - 4 * a * c;
               double root1=0,root2=0;
                if(d > 0)
                {
                    System.out.println("Roots are real and unequal");
                    root1 = ( - b + Math.sqrt(d))/(2*a);
                     root2 = (-b - Math.sqrt(d))/(2*a);
                    System.out.println("First root is:"+root1);
                    System.out.println("Second root is:"+root2);
                }
                else if(d == 0)
                {
                    System.out.println("Roots are real and equal");
                    root1 = (-b+Math.sqrt(d))/(2*a);
                    System.out.println("Root:"+root1);
                }
                else
                {
                    System.out.println("Roots are imaginary");
                }
                fw.write(root1+" "+root2+" , ");
                //System.out.println("x :"+y);
            }
            fw.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}




