package csp.m201403;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main1_2 {

    private static final int[] a = new int[1010];
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            a[abs(x)] ++;
            if (a[abs(x)] == 2)
                res ++;
        }

        System.out.println(res);
    }
}
