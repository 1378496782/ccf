package csp.m201409;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            set.add(x);
            if (set.contains(x - 1))
                res ++;
            if (set.contains(x + 1))
                res ++;
        }
        System.out.println(res);
    }
}
