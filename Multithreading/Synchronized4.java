class Table
{

    void printTable(int n)
    {
        synchronized(this) //synchronized block
        {
            for(int i=1; i<=5; i++)
                System.out.println(n*i);

        }
    }//end of the method
}
public class Synchronized4
{
    public static void main(String args[])
    {
        final Table obj = new Table();//only one object

        Thread t1=new Thread()
        {
            public void run()
            {
                obj.printTable(5);
            }
        };
        Thread t2=new Thread()
        {
            public void run()
            {
                obj.printTable(100);
            }
        };

        t1.start();
        t2.start();
    }
}

