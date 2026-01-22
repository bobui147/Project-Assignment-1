package searching;

import java.util.Scanner;

public class Problem4 {
    
    public static int calculateRating(int n, int[] workload) {
        int maxConsecutive = 0;
        int currentConsecutive = 0;
        
        for (int i = 0; i < n; i++) {
            if (workload[i] > 6) {
                currentConsecutive++;
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
            } else {
                currentConsecutive = 0;
            }
        }
        
        return maxConsecutive;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] workload = new int[n];
        
        for (int i = 0; i < n; i++) {
            workload[i] = sc.nextInt();
        }
        
        System.out.println(calculateRating(n, workload));
        
        sc.close();
    }
}
