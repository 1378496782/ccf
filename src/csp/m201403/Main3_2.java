package csp.m201403;

import java.util.Arrays;
import java.util.Scanner;

public class Main3_2 {
    
    private static final int N = 30;
    private static String[] ans = new String[N];
    private static final boolean[] op1 = new boolean[N];    // 无参
    private static final boolean[] op2 = new boolean[N];    // 有参
    private static int n;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next();

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i + 1) == ':') {
                op2[str.charAt(i) - 'a'] = true;
                i++;
            } else
                op1[str.charAt(i) - 'a'] = true;
        }
        
        n = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= n; i++) {
            Arrays.fill(ans, "");
            System.out.print("Case " + i + ":");
            String[] ss = input.nextLine().split(" ");
            for (int j = 1; j < ss.length; j++) {
                String s = ss[j];
                if (s.length() != 2 || s.charAt(0) != '-' || s.charAt(1) < 'a') 
                    break;
                if (op1[s.charAt(1) - 'a'])
                    ans[s.charAt(1) - 'a'] = "*";
                else if (op2[s.charAt(1) - 'a'] && j + 1 < ss.length) 
                    ans[s.charAt(1) - 'a'] = ss[j++ + 1];
                else 
                    break;
            }

            for (int j = 0; j < N; j++) {
                if (ans[j].length() > 0) {
                    System.out.print(" -" + (char) (j + 'a'));
                    if (op2[j])
                        System.out.print(" " + ans[j]);
                }
            }
            System.out.println();
        }
    }
}
