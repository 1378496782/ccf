package csp.m201612;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main2_2 {

    private static final int[] a = new int[]{0, 1500, 4500, 9000, 35000, 55000, 80000, 200000};
    private static final int[] b = new int[]{0, 3, 10, 20, 25, 30, 35, 45};
    
    private static int get(int x) {
        
        if (x <= 3500)
            return x;
        
        x -= 3500;
        int tax = 0;
        for (int i = 1 ; i < 8 ; i ++) {
            if (x >= a[i]) {
                tax += (a[i] - a[i - 1]) * b[i] / 100;
            } else {
                tax += (x - a[i - 1]) * b[i] / 100;
                break;
            }
        }
        
        return x + 3500 - tax;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0 ; ; i += 100) {
            if (get(i) == T) {
                System.out.println(i);
                break;
            }
        }
    }
}
