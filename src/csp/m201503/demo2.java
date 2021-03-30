package csp.m201503;

import java.util.*;

public class demo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else
                map.put(x, 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());   // 注意此处括号里要写 map.entrySet()
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                // value 降序 
                // key 升序
                if (o1.getValue().compareTo(o2.getValue()) == 0)
                    return o1.getKey().compareTo(o2.getKey());
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> m : list) 
            System.out.println(m.getKey() + " " + m.getValue());
    }
}
