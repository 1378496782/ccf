package csp.m201403;

import java.util.Scanner;

public class Main2_2 {
    
    private static class Window {
        int x1, y1, x2, y2;
        int id;

        Window(int x1, int y1, int x2, int y2, int id) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.id = id;
        }
    }

    private static final int N = 15;
    private static final Window[] w = new Window[N];
    private static int n, m;

    private static int get(int x, int y) {
        
        for (int i = n; i > 0; i--) {
            if (x >= w[i].x1 && x <= w[i].x2 && y >= w[i].y1 && y <= w[i].y2)
                return i;
        }
        return 0;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        for (int i = 1; i <= n; i++) 
            w[i] = new Window(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), i);

        for (int i = 0; i < m; i++) {
            int t = get(input.nextInt(), input.nextInt());
            if (t != 0) {
                System.out.println(w[t].id);
                Window window = w[t];
                for (int j = t; j < n; j++) 
                    w[j] = w[j + 1];
                w[n] = window;
            } else {
                System.out.println("IGNORED");
            }
        }
    }
}
