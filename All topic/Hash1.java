import java.util.*;
class Hash1
{
    public static void main(String args[])
    {

        HashSet<String> al=new HashSet<String>();
        al.add("Ravi");
        al.add("Ravi");
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(al);
    }
}
