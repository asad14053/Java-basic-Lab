
import java.util.*;
class Arraylist
{
    public static void main(String args[])
    {
        /// add(),  addAll()


        ArrayList<String> a1=new ArrayList<String>();//creating arraylist
        ArrayList<String> a2=new ArrayList<String>();
        a1.add("Ravi");///adding object in arraylist
        a2.add("Vijay");
        a1.add("Rani");
        a1.addAll(a2);

        Iterator itr=a1.iterator();///getting Iterator from arraylist to traverse elements

        /// foreach loop.............
        for(String obj:a1)
            System.out.println(obj);
        ///  iterator.............
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        /// remove(), removeAll()

        a1.remove("Ravi");
        a1.removeAll(a2);

        System.out.println("iterating the elements after removing the elements of al2...");
        itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ///  retain(),  retailAll();


        a1.retainAll(a2);
        System.out.println("iterating the elements after retaining the elements of al2...");
          itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
    }
}
