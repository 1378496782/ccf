package csp.m201803;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int L = input.nextInt();
        int t = input.nextInt();

        int[] a = new int[n];
        for (int i = 0 ; i < n ; i ++ )
            a[i] = input.nextInt();

        boolean[] f = new boolean[n];

        for (int k = 1 ; k <= t ; k ++) {

            for (int i = 0 ; i < n ; i ++) {
                if (!f[i])
                    a[i] ++;
                else
                    a[i] --;
            }

            for (int i = 0 ; i < n ; i ++) {
                if (a[i] == L || a[i] == 0)
                    f[i] = !f[i];
                for (int j = i + 1 ; j < n ; j ++) {
                    if (a[i] == a[j]) {
                        f[i] = !f[i];
                        f[j] = !f[j];
                    }
                }
            }
        }

        for (int x : a)
            System.out.print(x + " ");
        System.out.println();
    }
}