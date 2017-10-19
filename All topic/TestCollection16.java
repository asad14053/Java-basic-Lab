import java.util.*;
class TestCollection16
{
    public static void main(String args[])
    {

        TreeMap<Integer,String> hm=new TreeMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(104,"Rahul");

        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
