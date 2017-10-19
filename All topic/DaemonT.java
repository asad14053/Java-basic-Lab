public class DaemonT extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon()) //checking for daemon thread
        {
            System.out.println("daemon thread work");
        }
        else
        {
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args)
    {
        DaemonT t1=new DaemonT();//creating thread
        DaemonT t2=new DaemonT();
        DaemonT t3=new DaemonT();

        t1.setDaemon(true);//now t1 is daemon thread
        t1.start();//starting threads
        t2.start();
        t3.start();
    }
}
