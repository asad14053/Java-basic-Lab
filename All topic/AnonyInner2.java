
interface Person
{
    void eat();
}
class AnonyInner2
{

    public static void main(String args[])
    {
        Person p = new Person()
        {
           public void eat()
            {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}








