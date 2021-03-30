package csp.m201503;

import java.util.*;

public class demo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        // 初始化
        Stack[] grid = new Stack[n];
        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < m; j++) 
                stack.push(input.nextInt());
            grid[i] = stack;
        }

        // 操作
        Object[][] res = new Object[m][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                res[i][j] = grid[j].pop();
            }
        }
        
        // 输出
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) 
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
