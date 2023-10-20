public class Test9 {
    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.println("grate");
            case 'C':
                System.out.println("good");
                break;
            case 'd':
            case 'f':
                System.out.println("not good");
        }
    }
}

// grate good