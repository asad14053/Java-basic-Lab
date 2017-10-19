@FunctionalInterface

interface Person3
{
   public void eat();
}
class Lambda
{

    public static void main(String args[])
    {
        Person3 p = ()->System.out.println("nice fruits");
        p.eat();
    }
}









