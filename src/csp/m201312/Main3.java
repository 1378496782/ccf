package csp.m201312;

import java.util.Scanner;

public class Main3 {

    // 暴力解法
    public static int largestRectangleArea(int[] heights) {

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = 1;
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[j] < height)
                    break;
                width ++;
            }
            for (int j = i - 1; j >= 0 ; j--) {
                if (heights[j] < height)
                    break;
                width ++;
            }
            int area = width * height;
            res = Math.max(res, area);
        }

        return res;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) 
            heights[i] = input.nextInt();
        System.out.println(largestRectangleArea(heights));
    }
}
