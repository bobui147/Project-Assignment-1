package searching;

public class Problem3 {
    
    public static int searchInsert(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int key1 = 3;
        System.out.println("Example 1:");
        System.out.println("Array: [1, 2, 3, 4, 5]");
        System.out.println("Number: " + key1);
        System.out.println("Answer: " + searchInsert(arr1, key1));
        
        int[] arr2 = {1, 2, 3, 5};
        int key2 = 4;
        System.out.println("\nExample 2:");
        System.out.println("Array: [1, 2, 3, 5]");
        System.out.println("Number: " + key2);
        System.out.println("Answer: " + searchInsert(arr2, key2));
        
        int[] arr3 = {1, 2, 3, 5};
        int key3 = 0;
        System.out.println("\nExample 3 (Insert at beginning):");
        System.out.println("Array: [1, 2, 3, 5]");
        System.out.println("Number: " + key3);
        System.out.println("Answer: " + searchInsert(arr3, key3));
        
    }
}
