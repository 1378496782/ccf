package csp.m201712;

import java.util.*;
import static java.lang.Math.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i ++)
            a[i] = input.nextInt();

        int res = 10001;
        for (int i = 0 ; i < n ; i ++) {
            for (int j = i + 1 ; j < n ; j ++) {
                res = min(res, abs(a[i] - a[j]));
            }
        }
        System.out.println(res);
    }
}