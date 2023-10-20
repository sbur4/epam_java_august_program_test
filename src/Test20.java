public class Test20 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        call_arr(arr[0], arr);
        System.out.println(arr[0] + ", " + arr[1]);
    }

    static void call_arr(int i, int arr[]) {
        arr[i] = 6;
        i = 5;
    }
}

// 1,6