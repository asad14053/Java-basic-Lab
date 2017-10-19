import java.io.*;
import java.rmi.*;
interface class1
{
    public void m1() throws RemoteException
    {
        System.out.println("m1 in class1");
    }

interface class2
{
    public void m1() throws IOException
    {
        System.out.println("m1 in class2");

    }
}
class exception implements class1,class2
{
    void m1()
    {

    }
    public static void main(String args[])
    {
        exception obj = new exception();
            obj.m1();


    }
}
