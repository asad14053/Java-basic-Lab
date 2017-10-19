public class C
{
    public static void main(String[] args)
    {
        C c=new C();
        c.method1();
    }

    public void method1()
    {
        method2();
    }

    public void method2()
    {
        System.out.println("What is radius ");
    }

 //   Circle c = new Circle();
}
