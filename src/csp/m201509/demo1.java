package csp.m201509;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        nums[0] = input.nextInt();
        int count = 1;
        for (int i = 1; i < n; i++) {
            nums[i] = input.nextInt();
            if (nums[i] != nums[i - 1])
                count ++;
        }
        System.out.println(count);
    }
}
