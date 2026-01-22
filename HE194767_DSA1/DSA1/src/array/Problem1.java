package array;

import java.util.Arrays;

public class Problem1 {

    public static void moveZeroes(int[] arr) {
//        int n = arr.length;
//        int[] result = new int[n];
//        int index = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] != 0) {
//                result[index++] = arr[i];
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = result[i];
//        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] X = {4, 8, 0, 0, 2, 0, 1, 0};
        moveZeroes(X);
        System.out.println(Arrays.toString(X));
    }

}
