package searching;

public class Problem1 {
    
    // Linear Search - O(n)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    // Binary Search (Iterative) - O(log n)
    // Array must be sorted
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    // Binary Search (Recursive) - O(log n)
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, right);
        } else {
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78};
        int target = 38;
        
        // Linear Search
        int linearResult = linearSearch(arr, target);
        System.out.println("Linear Search:");
        if (linearResult != -1) {
            System.out.println("Element " + target + " found at index: " + linearResult);
        } else {
            System.out.println("Element " + target + " not found");
        }
        
        // Binary Search (Iterative)
        int binaryResult = binarySearch(arr, target);
        System.out.println("\nBinary Search (Iterative):");
        if (binaryResult != -1) {
            System.out.println("Element " + target + " found at index: " + binaryResult);
        } else {
            System.out.println("Element " + target + " not found");
        }
        
        // Binary Search (Recursive)
        int recursiveResult = binarySearchRecursive(arr, target, 0, arr.length - 1);
        System.out.println("\nBinary Search (Recursive):");
        if (recursiveResult != -1) {
            System.out.println("Element " + target + " found at index: " + recursiveResult);
        } else {
            System.out.println("Element " + target + " not found");
        }
        
        // Test with element not in array
        int notFound = 100;
        System.out.println("\nSearching for " + notFound + ":");
        System.out.println("Linear Search: " + linearSearch(arr, notFound));
        System.out.println("Binary Search: " + binarySearch(arr, notFound));
    }
}
