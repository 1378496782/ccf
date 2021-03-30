package csp.m201604;

import java.util.Scanner;

public class demo2 {

    private static final int N = 15, M = 10;
    private static int[][] g1 = new int[N][M];
    private static int[][] g2 = new int[N][M];
    private static int[][] obj = new int[4][4];
    private static int pos;
    
    private static void show(int[][] g) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) 
                System.out.print(g[i][j] + " ");
            System.out.println();
        }
    }

    private static boolean check(int row) {
        return false;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < N; i++) 
            for (int j = 0; j < M; j++) 
                g1[i][j] = input.nextInt();

        
        for (int i = 0; i < N; i++) 
            System.arraycopy(g1[i], 0, g2[i], 0, M);
        
        for (int i = 0; i < 4; i++) 
            for (int j = 0; j < 4; j++) 
                obj[i][j] = input.nextInt();
            
        pos = input.nextInt();

        int r = 0;
        while (true) {
            if (!check(r)) {
                r --;
                break;
            }
            r ++;
        }
    }
}
