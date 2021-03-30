package csp.m201312;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (!map.containsKey(x))
                map.put(x, 1);
            else
                map.put(x, map.get(x) + 1);
        }

        int minKey = 0, maxValue = 0;
        
        // 第一种遍历方法 keySet
/*        Set<Integer> keySet = map.keySet();
        for (Integer x : keySet) {
            int key = x, value = map.get(x);
            if (value > maxValue) {
                maxValue = value;
                minKey = key;
            } else if (value == maxValue) {
                minKey = Math.min(key, minKey);
            }
        }*/
        
        // 第二种遍历方法 entrySet
        Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = iter.next();
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > maxValue) {
                maxValue = value;
                minKey = key;
            } else if (value == maxValue) {
                minKey = Math.min(key, minKey);
            }
        }
        
        System.out.println(minKey);
    }
}
