package csp.m201403;

import java.util.Scanner;

public class Main3 {

    private static final int N = 25;
    private static int n;
    private static final String[] strs = new String[N];
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        n = input.nextInt();
        input.nextLine();   // 将 n 后面的回车过滤掉
        for (int i = 1; i <= n; i++) {

            strs[i] = input.nextLine();
            String[] ss = strs[i].split(" ");
            for (int j = 1; j < ss.length; j++) {
                String cur = ss[j];
            }
        }

        for (int i = 1; i <= n; i++)
            System.out.println(strs[i]);
        
    }
}
