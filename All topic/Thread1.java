 import java.io.*;
import java.util.*;
 class e implements Runnable
 {
     public void run()
     {
         for(int i= 1;i<=20;i+=2)
         System.out.println(i);
     }
 }
 class o implements Runnable
 {
     public void run()
     {
         for(int i= 0;i<=20;i+=2)
         System.out.println(i);
     }
 }
class Thread1
{
    public static void main(String args[])
    {
        Runnable a=new e();

        Thread t1=new Thread(a);
          Runnable b=new o();
         t1.start();
         Thread t2=new Thread(b); ///ekhane  t2.start(); t1.start(); eksathe dile interference hoy
          t2.start();
    }
}
