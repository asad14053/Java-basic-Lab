public class Threadtwice extends Thread
{
    public void run()
    {
        System.out.println("running...");
    }
    public static void main(String args[])
    {
        Threadtwice t1=new Threadtwice();
        t1.start();
        t1.start();
    }
}
