class xx
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
        xx obj=new xx();
        xx.Inner in=obj.new Inner();
        in.msg();
    }
}
