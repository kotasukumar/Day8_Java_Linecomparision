package com.company;

public class LengthComparision extends Line {

    public void compare() {
        getLength1();
        getLength2();
        System.out.println("Line1 length = " + length1);
        System.out.println("Line2 length = "  + length2);
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
