package csp.m201709;

import java.util.*;
import static java.lang.Math.*;

public class Main2 {

    private static class S {
        
        int time, type, id;

        public S(int id, int time, int type) {
            this.time = time;
            this.type = type;
            this.id = id;
        }

        @Override
        public String toString() {
            return time + " " + type + " " + id;
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int[] a = new int[N + 1];
        for (int i = 1 ; i <= N ; i ++)
            a[i] = i;

        S[] s = new S[K * 2];
        int k = 0;
        for (int i = 0 ; i < K ; i ++) {
            int id = input.nextInt();
            int start = input.nextInt();
            int len = input.nextInt();
            s[k ++] = new S(id, start, 0);
            s[k ++] = new S(id, start + len, 1);
        }

        Arrays.sort(s, new Comparator<S>() {
            @Override
            public int compare(S a, S b) {
                if (a.time != b.time)
                    return a.time - b.time;
                if (a.type != b.type)
                    return b.type - a.type;
                return a.id - b.id;
            }
        });

        for (S ss : s) {
            int type = ss.type;
            int id = ss.id;
            if (type == 0) {
                for (int i = 1 ; i <= N ; i ++) {
                    if (a[i] == id) {
                        a[i] = 0;
                        break;
                    }
                }
            } else { // type == 1
                for (int i = 1 ; i <= N ; i ++) {
                    if (a[i] == 0) {
                        a[i] = id;
                        break;
                    }
                }
            }
        }
        
        for (int i = 1 ; i <= N ; i ++)
            System.out.print(a[i] + " ");
        System.out.println();

    }
}