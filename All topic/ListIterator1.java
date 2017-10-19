import java.util.*;
class ListIterator1
{
    public static void main(String args[])
    {

        ArrayList<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        System.out.println("element at 2nd position: "+al.get(2));

        ListIterator<String> itr=al.listIterator();

        System.out.println("forward direction...");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("traversing elements in backward direction...");
        while(itr.hasPrevious())
        {
            System.out.println(itr.previous());
        }
    }
}
