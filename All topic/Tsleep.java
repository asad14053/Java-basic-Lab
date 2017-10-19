class Tsleep extends Thread
{
    synchronized public void run()
    {
        for(int i=1; i<5; i++)
        {
            try
            {
                Thread.sleep(50);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Tsleep t1=new Tsleep();
        Tsleep t2=new Tsleep();

        t1.start();
        t2.start();
    }
}
