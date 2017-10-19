class AnnonyInner1
{
    public static void main(String args[])
    {
        Person1 p = new Person1()
        {
            void eat()
            {
                System.out.println("nice fruits2");
            }
        };
        p.eat();
    }
}
class Person1
{
    void eat()
    {
        System.out.println("nice fruits3");
    }
}
