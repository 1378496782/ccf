package csp.m201312;

import java.util.Scanner;

public class Main1_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        final int N = 10010;
        int[] s = new int[N];
        for (int i = 0; i < n; i++) 
            s[input.nextInt()] ++;
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (s[i] > s[res])
                res = i;
        }

        System.out.println(res);
    }
}
