package searching;

public class Problem2 {
    
    public static int findFirst(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static int findLast(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    
    public static int[] findFirstAndLast(int[] arr, int key) {
        int first = findFirst(arr, key);
        int last = findLast(arr, key);
        return new int[]{first, last};
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key1 = 3;
        int[] result1 = findFirstAndLast(arr1, key1);
        System.out.println("Example 1:");
        System.out.println("Array: [1, 2, 3, 3, 3, 4, 4, 5]");
        System.out.println("Number: " + key1);
        System.out.println("Answer: [" + result1[0] + ", " + result1[1] + "]");
        
        // Example 2
        int[] arr2 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key2 = 5;
        int[] result2 = findFirstAndLast(arr2, key2);
        System.out.println("\nExample 2:");
        System.out.println("Array: [1, 2, 3, 3, 3, 4, 4, 5]");
        System.out.println("Number: " + key2);
        System.out.println("Answer: [" + result2[0] + ", " + result2[1] + "]");
        
        // Example 3 - Key not present
        int[] arr3 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key3 = 6;
        int[] result3 = findFirstAndLast(arr3, key3);
        System.out.println("\nExample 3 (Key not present):");
        System.out.println("Array: [1, 2, 3, 3, 3, 4, 4, 5]");
        System.out.println("Number: " + key3);
        System.out.println("Answer: [" + result3[0] + ", " + result3[1] + "]");
        
        // Example 4 - Single occurrence
        int[] arr4 = {1, 2, 3, 3, 3, 4, 4, 5};
        int key4 = 1;
        int[] result4 = findFirstAndLast(arr4, key4);
        System.out.println("\nExample 4 (Single occurrence):");
        System.out.println("Array: [1, 2, 3, 3, 3, 4, 4, 5]");
        System.out.println("Number: " + key4);
        System.out.println("Answer: [" + result4[0] + ", " + result4[1] + "]");
    }
}
