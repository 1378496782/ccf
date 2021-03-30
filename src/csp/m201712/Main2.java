package csp.m201712;

import java.util.*;
import static java.lang.Math.*;

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1 ; i <= n ; i ++)
            q.offer(i);

        int j = 1;
        while (q.size() > 1) {

            int t = q.poll();
            if (j % k != 0 && j % 10 != k)
                q.offer(t);
            j ++;
        }

        System.out.println(q.peek());
    }
}