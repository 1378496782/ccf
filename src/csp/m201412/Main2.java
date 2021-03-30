package csp.m201412;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] a = new int[2 * n][2 * n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) 
                a[i][j] = input.nextInt();
            
        int row, col;   // 定义行，列
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0) { // 偶数行……左下向右上
                row = i;    // 定义行
                col = 0;    // 定义列
                while (col <= i) {
                    if (row >= 0 && row < n && col >= 0 && col < n) 
                        System.out.print(a[row][col] + " ");
                    row --;
                    col ++;
                }
            } else {    // 奇数行……右上向左下
                row = 0;    // 定义行
                col = i;    // 定义列
                while (row <= i) {
                    if (row >= 0 && row < n && col >= 0 && col < n)
                        System.out.print(a[row][col] + " ");
                    row ++;
                    col --;
                }
            } 
        }
        System.out.println();
    }
}
