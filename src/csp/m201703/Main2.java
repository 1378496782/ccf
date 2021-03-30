package csp.m201703;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int[n + 1];
        for (int i = 1 ; i <= n ; i ++)
            a[i] = i;
        
        for (int i = 0 ; i < m ; i ++) {
            int p = input.nextInt();
            int q = input.nextInt();
            int k = 1;
            while (a[k] != p)
                k ++;
            int t = a[k];
            if (q > 0) {
                for (int j = k; j < k + q; j++)
                    a[j] = a[j + 1];
                a[k + q] = t;
            } else {
                for (int j = k; j > k + q; j --) 
                    a[j] = a[j - 1];
                a[k + q] = t;
            } 
        }
        
        for (int i = 1 ; i <= n ; i ++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
