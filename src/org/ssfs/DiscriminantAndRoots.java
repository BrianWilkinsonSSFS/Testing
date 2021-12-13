package org.ssfs;

public class DiscriminantAndRoots {

    public static String roots(int a, int b, int c) {
        double discriminate = (Math.pow(b, 2) - (4 * a * c));
        System.out.println(discriminate);
        String power = "";
        if (discriminate > 0){
            power = "2 real roots";
        }
        else if (discriminate < 0){
            power = "2 imaginary roots";
        }
        else{
            power = "1 real root";
        }
        return (a + "x^2 + " + b + "x + " + c + " has " + power);
    }

    public static void main(String[] args) {
        System.out.println(roots(1, 5, 6));

    }
 }
