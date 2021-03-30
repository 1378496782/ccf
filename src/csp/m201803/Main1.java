package csp.m201803;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int s = 0;
        int p = 1;
        while (x != 0) {
            if (x == 1) {
                s += 1;
                p = 1;
            } else {
                if (p == 1) {
                    s += 2;
                    p = 2;
                }
                else {
                    p += 2;
                    s += p;
                }
            }
            x = input.nextInt();
        }
        System.out.println(s);
    }
}