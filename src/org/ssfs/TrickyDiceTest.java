package org.ssfs;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrickyDiceTest {

    @Test
    public void regularRoll() {
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
        boolean result = (num1/10000.0 > .14 && num1/10000.0 < .18) && (num2/10000.0 > .14 && num2/10000.0 < .18) &&
                (num3/10000.0 > .14 && num3/10000.0 < .18) && (num4/10000.0 > .14 && num4/10000.0 < .18) &&
                (num5/10000.0 > .14 && num5/10000.0 < .18) && (num6/10000.0 > .14 && num6/10000.0 < .18);
        assertTrue(result);
    }

    @Test
    public void trickyRoll() {
        int num1=0, num2=0, num3=0, num4=0, num5=0, num6=0;
        for (int x = 0; x < 10000; x++) {
            int die = TrickyDice.trickyRoll();
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
        boolean result = (num1/10000.0 > .14 && num1/10000.0 < .18) && (num2/10000.0 > .14 && num2/10000.0 < .18) &&
                (num3/10000.0 > .14 && num3/10000.0 < .18) && (num4/10000.0 > .14 && num4/10000.0 < .18) &&
                (num5/10000.0 > .14 && num5/10000.0 < .18) && (num6/10000.0 > .14 && num6/10000.0 < .18);
        assertFalse(result);
    }
}