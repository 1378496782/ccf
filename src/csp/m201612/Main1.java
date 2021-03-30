package csp.m201612;

import java.util.*;

public class Main1 {
    
    public static void main(String[]  args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for ( int i = 0 ; i < n ; i ++ ) 
            nums[i] = input.nextInt();
        
        Set<Integer> res = new HashSet<>();
        for ( int i = 0 ; i < n ; i ++ ) {
            int flag = 0;
            for ( int j = 0 ; j < n ; j ++ ) {
                if (i == j)
                    continue;
                
                if (nums[j] > nums[i])
                    flag ++;
                else if (nums[j] < nums[i])
                    flag --;
            }
            if (flag == 0) 
                res.add(nums[i]);
        }

        if (res.size() == 0) {
            System.out.println(-1);
        } else {
            for (int x : res) 
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
