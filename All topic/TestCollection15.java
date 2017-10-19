import java.util.*;
class TestCollection15
{
    public static void main(String args[])
    {

        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        System.out.println(queue);
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        queue.remove();
        queue.poll();

        System.out.println("after removing two elements:");
        System.out.println(queue);

    }
}
