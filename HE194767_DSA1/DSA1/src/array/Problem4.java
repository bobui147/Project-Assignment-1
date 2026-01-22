import java.util.Arrays;

public class Problem4 {

    public static int maxProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        return Math.max(arr[0] * arr[1], arr[n - 1] * arr[n - 2]);
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        System.out.println(maxProduct(arr));
    }
}
