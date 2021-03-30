package csp.m201412;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int key = input.nextInt();
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
                res.add(value);
            } else {
                map.put(key, 1);
                res.add(1);
            }
        }
        for (int x : res) 
            System.out.print(x + " ");
        System.out.println();
    }
}
