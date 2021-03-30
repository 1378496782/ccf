    package csp.m201312;
    
    import java.util.Scanner;
    
    import static java.lang.Math.*;
    
    public class Main3_2 {
    
        public static void main(String[] args) {
    
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++)
                h[i] = input.nextInt();
    
            int res = 0;
            for (int i = 0; i < n; i++) {
                int width = 1;
                int l = i - 1, r = i + 1;
                while (l >= 0 && h[l] >= h[i]) {
                    l--;
                    width ++;
                }
                while (r < n && h[r] >= h[i]) {
                    r++;
                    width ++;
                }
                res = max(res, width * h[i]);
            }
    
            System.out.println(res);
        }
    }
