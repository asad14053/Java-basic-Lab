class TestInterrupting1 extends Thread
{

    public void run()
    {
        for(int i=1; i<=5; i++)
            System.out.println(i);
    }

    public static void main(String args[])
    {
        TestInterrupting1 t1=new TestInterrupting1();
        t1.start();
        t1.interrupt();

    }
}
