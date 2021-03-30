package csp.m201509;

import java.util.Scanner;

public class demo2 {

    // 是否是闰年
    static boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        int d = input.nextInt();
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(y))
            days[1]++;
        int mon = 1;
        for (int ds : days) {
            if (d <= ds)
                break;
            mon ++;
            d -= ds;
        }
        System.out.println(mon);
        System.out.println(d);
    }
}
