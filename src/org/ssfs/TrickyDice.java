package org.ssfs;

public class TrickyDice {

    public static int regularRoll() {
        int die = (int)(Math.random() * 6) + 1;
        return die;
    }

    public static int trickyRoll() {
        int roll = (int)(Math.random() * 100) + 1;
        if (roll < 15) return 1;
        else if (roll < 30) return 2;
        else if (roll < 60) return 3;
        else if (roll < 70) return 4;
        else if (roll < 75) return 5;
        else return 6;
    }

    public static void main(String[] args) {
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        for (int x = 0; x < 10000; x++) {
            int die = TrickyDice.regularRoll();
            switch (die) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
            }
        }
    System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6);

    }
}
