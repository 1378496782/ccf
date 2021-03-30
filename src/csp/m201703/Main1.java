package csp.m201703;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = input.nextInt();

        int sum = 0;
        int res = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum >= k) {
                res++;
                sum = 0;
            }
        }
        if (sum != 0)
            res ++;
        System.out.println(res);
    }
}
