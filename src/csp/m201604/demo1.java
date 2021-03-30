package csp.m201604;

import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) 
            nums[i] = input.nextInt();

        int count = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) || (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]))
                count ++;
        }
        System.out.println(count);
    }
}
