class Show
{
    interface Inner{
        void msg();
    }
}

class NestedInter2 implements Show.Inner
{
    public void msg()
    {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[])
    {
        Show.Inner m=new NestedInter2();//upcasting here
        m.msg();
    }
}

