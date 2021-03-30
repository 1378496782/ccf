package csp.m201512;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
                grid[i][j] = input.nextInt();
        }

        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
                res[i][j] = grid[i][j];
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int r = j, d = i;
                
                while (r + 1 < m && grid[i][r + 1] == grid[i][j]) 
                    r ++;
                
                while (d + 1 < n && grid[d + 1][j] == grid[i][j])
                    d ++;
                
                if (r - j >= 2) {
                    for (int k = j; k <= r; k++) 
                        res[i][k] = 0;
                }

                if (d - i >= 2) {
                    for (int k = i; k <= d; k++) {
                        res[k][j] = 0;
                    }
                }
            }
        }
        
        // show
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
