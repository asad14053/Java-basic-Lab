/*class Test
{
    public static void main(String[] args)
    {
        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1
                           + " e2 = " + t.e2);
    }
    public static void swap(T t)
    {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}
class T
{
    int e1 = 1;
    int e2 = 2;
}
*/

/*public class Test
{
    public static void main(String[] args)
    {
        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = " +
                           t1.i + " and j = " + t1.j);
        System.out.println("t2's i = " +
                           t2.i + " and j = " + t2.j);
    }
}
class T
{
    static int i = 0;
    int j = 0;
    T()
    {
        i++;
        j = 1;
    }
}
*/
/*public class Test
{
    int count=0;
    public static void main(String[] args)
    {
       // ...
       int n=getCount();
    }
    public  int getCount()
    {
        return count;
    }
    public static int factorial(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }
}
*/
/*
import java.util.Date;
public class Test
{
    public static void main(String[] args)
    {
        Date date = null;
        m1(date);
        System.out.println(date);
    }
    public static void m1(Date date)
    {
        date = new Date();
    }
}
*/
/*
import java.util.Date;
public class Test
{
    public static void main(String[] args)
    {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date)
    {
        date = new Date(7654321);
    }
}
*/
/*
import java.util.Date;
public class Test
{
    public static void main(String[] args)
    {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }
    public static void m1(Date date)
    {
        date.setTime(7654321);
    }
}
*/
import java.util.Date;
public class Test {
public static void main(String[] args) {
Date date = new Date(1234567);
m1(date);
System.out.println(date.getTime());
}
public static void m1(Date date) {
date = null;
}
}
