package csp.m201503;

import java.util.Scanner;

public class Main1_3 {
    
    private static final int N = 1010;
    private static final int[][] grid = new int[N][N];
    private static int n, m;
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                grid[i][j] = input.nextInt();
            
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) 
                System.out.print(grid[j][i] + " ");
            System.out.println();
        }
    }
}
