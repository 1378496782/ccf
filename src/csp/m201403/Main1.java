package csp.m201403;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (set.contains(-x))
                count ++;
            else
                set.add(x);
        }
        System.out.println(count);
    }
}
