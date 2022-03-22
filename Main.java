package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to line Comparison Program");

// line 1 variables
        int l1_x1 = 5;
        int l1_x2 = 6;
        int l1_y1 = 9;
        int l1_y2 = 111;
        double length1 = Math.sqrt((l1_x2 - l1_x1) ^ 2 + (l1_y2 - l1_y1) ^ 2);
// line 2 variables
        int l2_x1 = 2;
        int l2_x2 = 8;
        int l2_y1 = 20;
        int l2_y2 = 21;
        double length2 = Math.sqrt((l2_x2 - l2_x1) ^ 2 + (l2_y2 - l2_y1) ^ 2);
        System.out.println("line1 length = " + length1);
        System.out.println("line2 length = " + length2);

// comparing two lines
        if (length1 == length2) {
            System.out.println("both lines are equal");
        } else {
            System.out.println("both line are not equal");
            if (length1 > length2) {
                System.out.println("line1 is bigger then line2");
            } else {
                System.out.println("line2 is bigger then line1");

            }
        }
    }
}
