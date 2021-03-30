package csp.m201609;

import java.util.*;
import static java.lang.Math.*;

public class Main1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in) ;
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i ++) 
            a[i] = input.nextInt();
            
        int res = 0;
        for (int i = 1 ; i < n ; i ++) 
            res = max(res, abs(a[i] - a[i - 1]));
        
        System.out.println(res);
    }
}
