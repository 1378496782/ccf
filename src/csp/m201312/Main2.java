package csp.m201312;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        String[] ss = s.split("-");
        StringBuilder s1 = new StringBuilder(); // 去掉连接符，去掉最后一位，剩余的字符串
        for (int i = 0; i < ss.length - 1; i++) 
            s1.append(ss[i]);
        int sum = 0;
        for (int i = 1; i <= 9; i++) 
            sum += (s1.charAt(i - 1) - '0') * i;
        String trueFlag = String.valueOf(sum % 11);
        if (trueFlag.equals("10"))
            trueFlag = "X";
        String flag = ss[3];

        if (trueFlag.equals(flag)) {    // 输入是合法的ISBN号码
            System.out.println("Right");
        } else {    // 对输入的错误的ISBN号码进行纠正
            ss[3] = trueFlag;
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < ss.length; i++) {
                res.append(ss[i]);
                if (i != ss.length - 1)
                    res.append("-");
            }
            System.out.println(res);
        }
    }
}
