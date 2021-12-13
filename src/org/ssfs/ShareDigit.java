package org.ssfs;

public class ShareDigit {
    public static boolean numbers(int a, int b) {

        int a1 = a % 10;
        int a10 = a / 10;

        int b1 = b % 10;
        int b10 = b / 10;

        if (a10 == b10) {
            return true;
        }
        else if (a10 == b1) {
            return true;
        }
        else if (a1 == b10) {
            return true;
        }
        else if (a1 == b1) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

//        System.out.println(SD(12,23));
//        System.out.println(SD(12,43));
//        System.out.println(SD(12,44));

    }
}