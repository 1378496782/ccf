package csp.m201312;

import java.util.Scanner;

public class Main2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String ss = s.replace("-", "");
        int sum = 0;
        for (int i = 0; i < ss.length() - 1; i++) 
            sum += (ss.charAt(i) - '0') * (i + 1);
        int flag = sum % 11;
        char c;
        if (flag == 10)
            c = 'X';
        else
            c = (char) (flag + '0');
        if (c == ss.charAt(9)) 
            System.out.println("Right");
        else 
            System.out.println(s.substring(0, s.length() - 1) + c);
    }
}
