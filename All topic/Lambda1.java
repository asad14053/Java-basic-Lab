
@FunctionalInterface
interface Add {

    public int add(int a, int b);
}

public class Lambda1 {

    public static void main(String args[]) {
        // this is lambda expression
        Add plus = (a,b) -> a + b;
        System.out.println("Sum of 10,34 : " + plus.add(10, 34));

    }
}
