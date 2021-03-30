package csp.m202012;

import java.util.Scanner;
import static java.lang.Math.*;

public class demo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += input.nextInt() * input.nextInt();

        System.out.println(max(0, sum));
    }
}
