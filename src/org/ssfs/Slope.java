package org.ssfs;

public class Slope {

    public static String slope(int x1, int y1, int x2, int y2) {
        if (x1 == x2) {
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is " + "a vertical line and the slope is undefined.";
        }

        else {
            double slope = (double)(y2-y1)/(x2-x1);
            return "The line defined by the points ("+x1+", "+y1+") and ("+x2+", "+y2+") is " + "has a slope of "+slope;
        }
    }

    public static boolean shareDigit(int num1, int num2) {
        int l1 = num1 / 10;
        int l2 = num2 / 10;
        int r1 = num1 % 10;
        int r2 = num2 % 10;

        if(l1 == l2){
            return true;
        }
        if(r1 == r2){
            return true;
        }
        if(l1 == r2){
            return true;
        }
        if(l2 == r1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
