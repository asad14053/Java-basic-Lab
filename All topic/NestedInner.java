
class NestedInner {

    static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String args[]) {
        NestedInner.Inner obj = new NestedInner.Inner();
        obj.msg();
    }
}

