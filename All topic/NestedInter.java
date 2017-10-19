interface Show
{
    void show();
    interface Inner{
        void msg();
    }
}

class NestedInter implements Show.Inner
{
    public void msg()
    {
        System.out.println("Hello nested interface");
    }

    public static void main(String args[])
    {
        Show.Inner m=new NestedInter();//upcasting here
        m.msg();
    }
}
