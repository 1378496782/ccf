package csp.m201609;

import java.util.*;
import static java.lang.Math.*;

public class Main2 {

    private static final int N = 110;
    private static final int[] a = new int[N];
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        boolean success = false;
        for (int i = 0 ; i < n ; i ++) {
            int ticketNum = input.nextInt();
            
            
            for (int j = 1; j <= 100 ; j += 5) {
                int c = 0;  // 每一排的最大连续空缺位
                int end = (j / 5 + 1) * 5;
                for (int k = end ; k >= j ; k --) {
                    if (a[k] == 1)
                        break;
                    c ++;
                }
                if (c >= ticketNum) {
                    success = true;
                    int cnt = 0;
                    for (int k = j ; k <= end ; k ++) {
                        if (a[k] == 1)
                            continue;
                        a[k] = 1;
                        System.out.print(k + " ");
                        cnt ++;
                        if (cnt == ticketNum)
                            break;
                    }
                    System.out.println();
                    break;
                }
            }

            if (!success) {
                int cnt = 0;
                for (int j = 1 ; j <= 100 ; j ++) {
                    if (a[j] == 1)
                        continue;
                    cnt ++;
                    a[j] = 1;
                    System.out.print(j + " ");
                    if (cnt == ticketNum)
                        break;
                }
                System.out.println();
            }
        }
    }
}