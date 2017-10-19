import java.util.*;
class List{
 public static void main(String args[]){

  List<String> al=new ArrayList<String>();//creating arraylist
  al.add("Ravi");//adding object in arraylist

  List<String> al2=new LinkedList<String>();//creating linkedlist
  al2.add("James");//adding object in linkedlist
   al.addAll(al2);

  System.out.println("arraylist: "+al);
  System.out.println("linkedlist: "+al2);
 }
}
