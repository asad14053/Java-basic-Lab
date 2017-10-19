class Outer
{
    private int data=30;
    class Inner
    {
        void msg()
        {
            System.out.println("data is "+data);
        }
    }
    public static void main(String args[])
    {
        Outer obj=new Outer();
        Outer.Inner in=obj.new Inner();
        in.msg();
    }
}

