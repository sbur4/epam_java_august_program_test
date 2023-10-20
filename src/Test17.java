public class Test17 {
    public static void main(String[] args) {
        int a = 873;
        int b = 786;
        int c = 708;
        int d = 638;
        int e = 575;

        int res = a - b;
        int res2 = b - c;
        int res3 = c - d;
        int res4 = d - e;
        System.out.println(res + " " + res2 + " " + res3 + " " + res4);
        // 87 78 70 63 =>
        int res5 = res - res2;
        int res6 = res2 - res3;
        int res7 = res3 - res4;
        System.out.println(res5 + " " + res6 + " " + res7);
        // 9 8 7 => 6
        int res8 = e - 63 + 6;
        System.out.println(res8);
    }
}

// 512