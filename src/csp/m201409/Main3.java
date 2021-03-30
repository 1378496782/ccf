package csp.m201409;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.next();
        int flag = input.nextInt();
        int n = input.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) 
            list.add(input.next());
        
        for (String ss : list) {
            if (flag == 1 && ss.contains(s))  // 大小写敏感
                System.out.println(ss);
            else if (flag == 0 && ss.toLowerCase().contains(s.toLowerCase()))
                System.out.println(ss);
        }
    }
}
