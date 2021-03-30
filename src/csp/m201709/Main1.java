package csp.m201709;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n /= 10;
        int res = 0;
        int a = n / 5;
        res += a * 7;
        n %= 5;
        res += n >= 3 ? n + 1 : n;
        System.out.println(res);
    }
}
