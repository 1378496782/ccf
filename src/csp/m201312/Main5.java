package csp.m201312;

import java.util.Scanner;

public class Main5 {

    private static int n, m;
    private static final int N = 55;
    private static final char[][] g = new char[N][N];
    private static final boolean[][] st1 = new boolean[N][N];
    private static final boolean[][] st2 = new boolean[N][N];
    private static final int[] dx = new int[]{-1, 0, 1, 0};
    private static final int[] dy = new int[]{0, 1, 0, -1};

    private static boolean check(int x, int y, int k) {
        char c = g[x][y];
        if (c == 'S' || c == 'T' || c == '+')
            return true;
        if (c == '-' && (k == 1 || k == 3))
            return true;
        if (c == '|' && (k == 0 || k == 2))
            return true;
        return c == '.' && k == 2;
    }
    
    private static void dfs1(int x, int y) {
        
        st1[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a < 0 || a >= m || b < 0 || b >= n || g[a][b] == '#')
                continue;
            if (st1[a][b])
                continue;
            if (check(x, y, i))
                dfs1(a, b);
        }
    }
    
    private static void dfs2(int x, int y) {
        
        st2[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a < 0 || a >= m || b < 0 || b >= n || g[a][b] == '#')
                continue;
            if (st2[a][b])
                continue;
            if (check(a, b, i ^ 2))
                dfs2(a, b);
        }
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        m = input.nextInt();    // m 行
        n = input.nextInt();    // n 列
        for (int i = 0; i < m; i++) 
            g[i] = input.next().toCharArray();

        int x = 0, y = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (g[i][j] == 'S')
                    dfs1(i, j);
                else if (g[i][j] == 'T') {
                    x = i;
                    y = j;
                    dfs2(i, j);
                }
            }
        }

        if (st1[x][y]) {
            int res = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (st1[i][j] && !st2[i][j])
                        res ++;
                }
            }
            System.out.println(res);
        } else  // !st1[x][y]
            System.out.println("I'm stuck!");
    }
}
