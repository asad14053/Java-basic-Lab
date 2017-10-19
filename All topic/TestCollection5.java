import java.util.*;
class TestCollection5{
 public static void main(String args[]){

  LinkedHashSet<String> al=new LinkedHashSet<String>();
  al.add("Ravi");
   al.add("Ravi");

  Iterator<String> itr=al.iterator();
  while(itr.hasNext()){
   System.out.println(itr.next());
  }
 }
}
