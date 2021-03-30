package csp.m201412;

import java.util.Scanner;
import static java.lang.Math.*;

public class Main3_2 {

    private static final int N = 5010;

    private static class Stock {
        int type;   // type == 1 买          type == 2 卖
        double price;
        long sum;
        boolean isDel;

        public Stock(int type, double price, long sum) {
            this.type = type;
            this.price = price;
            this.sum = sum;
            isDel = false;
        }

        public Stock(int type, double price, long sum, boolean isDel) {
            this.type = type;
            this.price = price;
            this.sum = sum;
            this.isDel = isDel;
        }

        @Override
        public String toString() {
            return "Stock{" +
                    "type=" + type +
                    ", price=" + price +
                    ", sum=" + sum +
                    ", isDel=" + isDel +
                    '}';
        }
    }

    private static Stock[] s = new Stock[N];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        while (input.hasNext()) {
            String type = input.next();
            if (type.equals("buy"))
                s[++n] = new Stock(1, input.nextDouble(), input.nextLong());
            else if (type.equals("sell"))
                s[++n] = new Stock(2, input.nextDouble(), input.nextLong());
            else {
                int i = input.nextInt();
                s[i].isDel = true;
                s[++n] = new Stock(0, 0, 0, true);
            }
        }
        
        long resSum = 0;
        double resP = 0;
        for (int i = 1; i <= n; i++) {
            long s1 = 0, s2 = 0;
            if (!s[i].isDel) {
                for (int j = i + 1; j <= n; j++) {
                    if (!s[j].isDel) {
                        if (s[j].type == 1 && s[j].price >= s[i].price)
                            s1 += s[j].sum;
                        else if (s[j].type == 2 && s[j].price <= s[i].price)
                            s2 += s[j].sum;
                    }
                }

                long t = min(s1, s2);
                if (resSum < t || (t == resSum && s[i].price > resP)) {
                    resP = s[i].price;
                    resSum = t;
                }
            }
        }

        System.out.printf("%.2f ", resP);
        System.out.println(resSum);
    }
}
