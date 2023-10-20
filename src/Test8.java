public class Test8 {
    public static void main(String[] args) {
        int num = 9;
        boolean divisionBy7 = false;
        while (!divisionBy7) {
            System.out.println(num);
            if (num % 7 == 0)
                divisionBy7 = true;
            --num;
        }
    }
}

// 987