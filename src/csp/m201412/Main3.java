package csp.m201412;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main3 {

    private static final int N = 5010;
    private static class Stock {
        double price;
        int num;

        public Stock(double price, int num) {
            this.price = price;
            this.num = num;
        }
    }

    private static Stock[] buy = new Stock[N];
    private static Stock[] sell = new Stock[N];
    private static final boolean[] flag = new boolean[N];   // 为真代表没有删除
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 1;
        while (input.hasNext()) {
            String state = input.next();
            if (state.equals("cancel")) {
                int id = input.nextInt();
                flag[id] = false;
                continue;
            }
            
            double price = input.nextDouble();
            int num = input.nextInt();
            flag[i] = true;
            if (state.equals("buy"))
                buy[i] = new Stock(price, num);
            else if (state.equals("sell"))
                sell[i] = new Stock(price, num);
            i ++;
        }

        Arrays.sort(buy, new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return (int) ((o1.price - o2.price) * 100);
            }
        });
        
        Arrays.sort(sell, new Comparator<Stock>() {
            @Override
            public int compare(Stock o1, Stock o2) {
                return (int) ((o1.price - o2.price) * 100);
            }
        });
    }
}
