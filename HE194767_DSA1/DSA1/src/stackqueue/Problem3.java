package stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem3 {
    
    static class Cell {
        int row, col, day;
        
        Cell(int row, int col, int day) {
            this.row = row;
            this.col = col;
            this.day = day;
        }
    }
    
    public static int minDaysToRotApples(int[][] grid, int n, int m) {
        Queue<Cell> queue = new LinkedList<>();
        int freshCount = 0;
        
        // Find all rotten apples and count fresh apples
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Cell(i, j, 0));
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        // If no fresh apples, return 0
        if (freshCount == 0) {
            return 0;
        }
        
        // If no rotten apples but there are fresh apples, impossible
        if (queue.isEmpty()) {
            return -1;
        }
        
        // BFS to rot adjacent fresh apples
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int maxDays = 0;
        
        while (!queue.isEmpty()) {
            Cell current = queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int newRow = current.row + dx[i];
                int newCol = current.col + dy[i];
                
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m 
                    && grid[newRow][newCol] == 1) {
                    grid[newRow][newCol] = 2;
                    freshCount--;
                    int newDay = current.day + 1;
                    maxDays = Math.max(maxDays, newDay);
                    queue.offer(new Cell(newRow, newCol, newDay));
                }
            }
        }
        
        // If there are still fresh apples, it's impossible
        return freshCount == 0 ? maxDays : -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            
            System.out.println(minDaysToRotApples(grid, n, m));
        }
        
        sc.close();
    }
}
