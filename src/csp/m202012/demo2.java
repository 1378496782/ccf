package csp.m202012;

import java.util.*;
import static java.lang.Math.*;

public class demo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        int m = input.nextInt();
        for (int i = 0; i < m; i++) 
            list.add(new int[]{input.nextInt(), input.nextInt()});
        
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        
        
        int best = 0, index = 0;
        for (int i = 0; i < list.size(); i++) {
            int cnt = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j)[0] < list.get(i)[0] && list.get(j)[1] == 0)
                    cnt ++;
                if (list.get(j)[0] >= list.get(i)[0] && list.get(j)[1] == 1)
                    cnt ++;
            }

            if (cnt >= best) {
                best = cnt;
                index = i;
            }
        }

        System.out.println(list.get(index)[0]);
    }
}
