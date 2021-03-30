package csp.m201503;

import java.util.Scanner;

/**
 * 求星期问题的模板
 */
public class Main3 {

    private static final int[] months = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static boolean is_leap(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    // 求某月有多少天
    private static int get_days(int year, int month) {
        if (is_leap(year) && month == 2)
            return 29;
        return months[month];
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int y1 = input.nextInt(), y2 = input.nextInt();
        
        int days = 0;
        for (int y = 1850; y <= y2; y++) {
            for (int m = 1; m <= 12; m++) {

                if (y >= y1 && m == a) {
                    int w = (1 + days) % 7;
                    int count = 0;
                    for (int d = 1; d <= get_days(y, m); d++) {
                        if (w == c - 1) {
                            count++;
                            if (count == b) {
                                System.out.printf("%04d/%02d/%02d\n", y, m, d);
                                break;
                            }
                        }
                        w = (w + 1) % 7;
                    }
                    if (count < b)
                        System.out.println("none");
                }
                days += get_days(y, m);
            }
        }
    }
}
