package csp.m201503;

import java.util.Scanner;

public class Main1_2 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] res = new int[n][m];

        for (int j = 0; j < m; j++)
            for (int i = n - 1; i >= 0; i--)
                res[i][j] = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
