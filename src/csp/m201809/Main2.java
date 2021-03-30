package csp.m201809;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[1000000];
        int res = 0;
        for (int i = 0; i < n; i++) {
            int s = input.nextInt();
            int t = input.nextInt();
            for (int j = s; j < t; j++) 
                a[j] = 1;
        }
        for (int i = 0; i < n; i++) {
            int s = input.nextInt();
            int t = input.nextInt();
            for (int j = s; j < t; j++)
                if (a[j] == 1)
                    res ++;
        }
        System.out.println(res);
    }
}
