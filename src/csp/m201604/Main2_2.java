package csp.m201604;

import java.util.*;

public class Main2_2 {

    private static final int N = 20;
    private static final int[][] g = new int[N][N];
    private static final int[][] s = new int[N][N];
    private static final int[][] p = new int[4][4];
    
    // 是否有重叠
    private static boolean draw(int x, int y) {
        
        for (int i = 0; i < 15; i++)
            System.arraycopy(g[i], 0, s[i], 0, 10); 

        for (int i = 0 ; i < 4 ; i ++) {
            for (int j = 0 ; j < 4 ; j ++) {
                if (p[i][j] == 1) {
                    int a = x + i, b = y + j;
                    s[a][b] ++;
                    if (s[a][b] == 2)
                        return true;
                }
            }
        }
        return false;
    }
    
    private static void show() {
        for (int i = 0 ; i < 15 ; i ++) {
            for (int j = 0 ; j < 10 ; j ++)
                System.out.print(s[i][j] + " ");
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < 15; i++) 
            for (int j = 0; j < 10; j++) 
                g[i][j] = input.nextInt();
            
        
        for (int i = 0; i < 10; i++) {
            g[15][i] = 1;
            s[15][i] = 1;
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) 
                p[i][j] = input.nextInt();
        }
        
        int c = input.nextInt();
        c --;
        
        for (int i = 0; ; i++) {
            if (draw(i, c)) {
                draw(i - 1, c);
                break;
            }
        }
        
        show();
    }
}
