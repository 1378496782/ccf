package csp.m201809;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<String> doc = new ArrayList<>();   // 结构化文档
        List<String> s = new ArrayList<>(); // 选择器的集合
        input.nextLine();
        for (int i = 0; i < n; i++) 
            doc.add(input.nextLine());
        for (int i = 0; i < m; i++) 
            s.add(input.nextLine());
        System.out.println(doc);
        System.out.println(s);
    }
}

/* 

11 5
html
..head
....title
..body
....h1
....p #subtitle
....div #main
......h2
......p #one
......div
........p #two
p
#subtitle
h3
div p
div div p

*/