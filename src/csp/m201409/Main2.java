package csp.m201409;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Point {
    
    int x, y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}

class Area {
    
    Point p1, p2;
    int S;
    
    Area(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        S = (p2.x - p1.x) * (p2.y - p1.y);
    }
}


public class Main2 {

    static int compareTo(Point p1, Point p2) {
        if (p1.x < p2.x && p1.y < p2.y)
            return -1;
        return 0;   // 有问题
    }
    
    static int repeatS(Area a1, Area a2) {  // 两个区域重复的面积
        
        if (a1.p2.x <= a2.p1.x && a1.p2.y <= a2.p1.y) // 两个区域相离
            return 0;
        return 0;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Area> areas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point p1 = new Point(input.nextInt(), input.nextInt());
            Point p2 = new Point(input.nextInt(), input.nextInt());
            Area area = new Area(p1, p2);
            areas.add(area);
        }
        for (Area a : areas)
            System.out.println(a.S);
        
    }
}
