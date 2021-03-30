package csp.m201403;

import java.util.*;

class Point {
    int x, y;
    int floor;  // 第几层

    Point() {
        
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean isIn(Point p1, Point p2) {
        return x >= p1.x && y >= p1.y && x <= p2.x && y <= p2.y;
    }

    boolean isIn(Area a) {
        return x >= a.p1.x && y >= a.p1.y && x <= a.p2.x && y <= a.p2.y;
    }
    
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Area {
    Point p1, p2;
    int floor;  // 层数

    Area() {
        
    }
    
    Area(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    Area(Point p1, Point p2, int floor) {
        this.p1 = p1;
        this.p2 = p2;
        this.floor = floor;
    }
}

public class Main2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        List<Area> areas = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Point p1 = new Point(input.nextInt(), input.nextInt());
            Point p2 = new Point(input.nextInt(), input.nextInt());
            Area area = new Area(p1, p2, i + 1);
            areas.add(area);
        }
        List<Point> clickPoints = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            Point p = new Point(input.nextInt(), input.nextInt());
            clickPoints.add(p);
        }
        
        for (Point p : clickPoints) {
            for (int i = n - 1; i >= 0; i--) {
                Area area = areas.get(i);
                if (p.isIn(area)) {
                    System.out.println(area.floor);
                    areas.remove(i);
                    areas.add(area);
                    break;
                }
                
                if (i == 0 && !p.isIn(area))
                    System.out.println("IGNORED");
            }
        }
    }
}