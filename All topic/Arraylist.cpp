
import java.util.*;
class Arraylist
{
    public static void main(String args[])
    {

        ArrayList<String> al=new ArrayList<String>();//creating arraylist
        al.add("Ravi");///adding object in arraylist
        al.add("Vijay");
        Iterator itr=al.iterator();///getting Iterator from arraylist to traverse elements

        /// foreach loop.............
        for(String obj:al)
            System.out.println(obj);
        ///  iterator.............
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
