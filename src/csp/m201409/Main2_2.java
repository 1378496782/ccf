package csp.m201409;

import java.util.Scanner;

public class Main2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int N = 100;
        int[][] area = new int[N][N];
        for (int i = 0; i < n; i++) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) 
                    area[j][k] = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (area[i][j] == 1)
                    sum ++;
            }
        }
        System.out.println(sum);
    }
}

