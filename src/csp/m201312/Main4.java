package csp.m201312;

import java.util.Scanner;

public class Main4 {

    private static final int mod = (int) (1e9 + 7);
    private static final int N = 1010;
    private static final int[][] C = new int[N][N];
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // todo 预处理组合数
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    C[i][j] = 1;
                else
                    C[i][j] = (C[i - 1][j] + C[i - 1][j - 1]) % mod;
            }
        }

        long res = 0;
        for (int k = 2; k <= n - 2; k++) 
            res = (res + (long) C[n - 1][k] * (k - 1) % mod * (n - k - 1) % mod) % mod;

        System.out.println(res);
    }
}
