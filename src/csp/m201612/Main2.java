package csp.m201612;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        double res = 0;
        if (T < 3500)
            res = T;
        else if (T < 5000)
            res = (T - 105) / 0.97;
        else if (T < 8000)
            res = (T - 455) / 0.9;
        else if (T < 12500)
            res = (T - 1255) / 0.8;
        else if (T < 38500)
            res = (T - 1880) / 0.75;
        else if (T < 58500)
            res = (T - 3805) / 0.7;
        else if (T < 83500)
            res = (T - 6730) / 0.65;
        else
            res = (T - 15080) / 0.55;
        System.out.printf("%.0f\n", res);
    }
}
