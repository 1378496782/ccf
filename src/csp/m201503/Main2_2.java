package csp.m201503;

import java.util.*;

public class Main2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue()))
                return o2.getValue() - o1.getValue();
            return o1.getKey() - o2.getKey();
        });
        
        for (Map.Entry<Integer, Integer> entry : list)
            System.out.println(entry.getKey() + " " + entry.getValue());
    }    
}
