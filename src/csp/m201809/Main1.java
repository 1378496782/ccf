package csp.m201809;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = input.nextInt();
        int[] res = new int[n];
        res[0] = (a[0] + a[1]) / 2;
        res[n - 1] = (a[n - 1] + a[n - 2]) / 2;
        for (int i = 1; i < n - 1; i++) 
            res[i] = (a[i - 1] + a[i] + a[i + 1]) / 3;
        for (int x : res)
            System.out.print(x + " ");
        System.out.println();
    }
}
