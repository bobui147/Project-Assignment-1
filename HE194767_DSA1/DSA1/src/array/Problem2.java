package array;

import java.util.Arrays;

public class Problem2 {

    public static void sort012(int[] arr) {
//        int count0 = 0, count1 = 0, count2 = 0;
//

//        for (int x : arr) {
//            if (x == 0) count0++;
//            else if (x == 1) count1++;
//            else if (x == 2) count2++;
//        }
//
//        int index = 0;
//
//        for (int i = 0; i < count0; i++) {
//            arr[index++] = 0;
//        }
//
//        for (int i = 0; i < count1; i++) {
//            arr[index++] = 1;
//        }
//
//        for (int i = 0; i < count2; i++) {
//            arr[index++] = 2;
//        }
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {

                mid++;
            } else { 
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 1, 0, 1, 2, 1, 0,1,2,2,1,0};
        sort012(X);
        System.out.println(Arrays.toString(X));
    }
}
