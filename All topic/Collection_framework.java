
import java.util.*;
class Collecton_framework {

    public static void main(String[] args) {
///Array list///
        System.out.println("Array List: ");
        ArrayList<String> Al = new ArrayList<>();
        Al.add("Ravi");
        Al.add("Vijay");
        Al.add("Ajay");
        ArrayList<String> Al1 = new ArrayList<>();
        Al1.add("Sonoo");
        Al1.add("Hanumat");
        Al1.addAll(Al);

        Iterator itr = Al1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println(Al1);
////vector
        System.out.println("Vector : ");
        Vector<String> v = new Vector<String>();
        v.add("umesh");
        v.addElement("irfan");
        v.addElement("kumar");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        System.out.println(v);
///Set
        Set<String> s = new HashSet();
        s.add("asad");
        s.add("asad");
        s.add("asad");
        System.out.println("Set : ");
        Iterator it4 = s.iterator();
        while (it4.hasNext()) {
            System.out.println(it4.next());
        }
        System.out.println(s);

/// linkedlist
        LinkedList<String> ll1 = new LinkedList<String>();
        ll1.add("Ravi");
        ll1.add("Vijay");
        ll1.add("Ravi");
        ll1.add("Ajay");
        System.out.println("Linked List :");
        Iterator<String> it = ll1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(ll1);
/// hashset///

        HashSet<String> hs = new HashSet<String>();
        hs.add("Ravi");
        hs.add("Ravi");

        Iterator<String> it1 = hs.iterator();
        System.out.println("Hash set :");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
        System.out.println(hs);
// linked hashset//

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Ravi");
        lhs.add("Vijay");
        lhs.add("Ravi");
        lhs.add("Ajay");
        System.out.println("Linked hash set :");
        Iterator<String> it2 = lhs.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println(lhs);

// treeset
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Ravi");
        ts.add("Vijay");
        System.out.println("Trre set :");
        Iterator<String> it3 = ts.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
        System.out.println(ts);
    }
}
