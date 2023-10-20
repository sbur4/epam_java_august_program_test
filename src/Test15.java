public class Test15 {
    public static void main(String[] args) {
        boolean A = false;
        boolean B = true;
        System.out.println(!(A || B) && (!A && B));
    }
}

// false