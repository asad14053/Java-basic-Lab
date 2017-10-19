class Trun extends Thread
{
    public void run()
    {
        for(int i=1; i<=5; i++)
        {
            try
            {
                Thread.sleep(500);
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
        Trun t1=new Trun();
        Trun t2=new Trun();
        t1.run();
        t2.run();
    }
}
