package com.company;

public class Line {
    double length1;
    double length2;

    public void getLength1() {
        Point point1 = new Point();
        point1.x1 = 5;
        point1.x2 = 10;
        point1.y1 = 5;
        point1.y2 = 100;

        Line line1 = new Line();
        length1 = Math.sqrt((point1.x2 - point1.x1) ^ 2 + (point1.y2 - point1.y1) ^ 2);
    }

    public void getLength2() {
        Point point2 = new Point();
        point2.x1 = 2;
        point2.x2 = 8;
        point2.y1 = 20;
        point2.y2 = 21;

        Line line2 = new Line();
        length2 = Math.sqrt((point2.x2 - point2.x1) ^ 2 + (point2.y2 - point2.y1) ^ 2);
    }
}
