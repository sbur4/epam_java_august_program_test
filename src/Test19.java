public class Test19 {
    public static void m(Object o) {
        System.out.println("object");
    }

    public static void m(Number n) {
        System.out.println("number");
    }

    public static void m(Integer o) {
        System.out.println("integer");
    }

    public static void main(String[] args) {
        Number n = new Integer("10");
        m(n);
    }
}

// number