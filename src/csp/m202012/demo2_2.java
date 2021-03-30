package csp.m202012;

import java.util.*;

public class demo2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        int m = input.nextInt();
        for (int i = 0; i < m; i++)
            list.add(new int[]{input.nextInt(), input.nextInt()});

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0])
                    return a[0] - b[0];
                return b[1] - a[1];
            }
        });

        int[] small = new int[m];
        int[] big = new int[m];
        int[] res = new int[m];
        big[m - 1] = list.get(m - 1)[1] == 1 ? 1 : 0;

        int miss = 0;
        for (int i = 1; i < m; i++) {

            if (list.get(i)[0] > list.get(i - 1)[0] && list.get(i - 1)[1] == 0) {
                small[i] = small[i - 1] + 1;
                if (miss != 0) {
                    small[i] += miss;
                    miss = 0;
                }
            } else {
                small[i] = small[i - 1];
            }
            if (list.get(i)[0] == list.get(i - 1)[0] && list.get(i - 1)[1] == 0)
                miss ++;
            
        }

        for (int i = m - 2; i >= 0; i--) 
            big[i] = list.get(i)[1] == 1 ? big[i + 1] + 1 : big[i + 1];

        int index = 0;
        for (int i = 0; i < m; i++) {
            res[i] = small[i] + big[i];
            if (i > 0 && res[i] > res[i - 1])
                index = i;
        }

        System.out.println(list.get(index)[0]);
    }
}
