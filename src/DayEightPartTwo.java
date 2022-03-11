import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DayEightPartTwo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("files/digits.txt"));
        int total = 0;
        while (scan.hasNextLine()) {
            String output = scan.nextLine();
            total += processLine(output);

        }
        scan.close();
        System.out.println(total);
    }

    public static int processLine(String output) {
        int line = output.indexOf("|");
        String[] input = output.substring(0, line-1).split(" ");
        String[] correct = findDigits(input);
        output = output.substring(line+2);
        String[] digits = output.split(" ");
        return decodedNumber(correct, digits);
    }

    public static int decodedNumber(String[] correct, String[] digits) {
        String number = "";
        for (int j=0; j<digits.length; j++) {
            String current = digits[j];
            for (int i=0; i < correct.length; i++) {
                String testing = correct[i];
                if (current.length() == testing.length() && segmentsInCommon(current, testing) == current.length())
                    number += i;
            }
        }
        return Integer.parseInt(number);
    }

    public static String[] findDigits(String[] input) {
        String[] correct = new String[10];
        for (int i=0; i<input.length; i++) {
            String current = input[i];
            if (current.length() == 2) {
                correct[1] = current;
            }

            else if (current.length() == 3) {
                correct[7] = current;
            }
            else if (current.length() == 4) {
                correct[4] = current;
            }
            else if (current.length() == 7) {
                correct[8] = current;
            }
        }

        for (int i=0; i<input.length; i++) {
            String current = input[i];
            if (current.length() == 5) {
                if (segmentsInCommon(current, correct[4]) == 2)
                    correct[2] = current;
                else if (segmentsInCommon(current, correct[1]) == 2)
                    correct[3] = current;
                else
                    correct[5] = current;
            } else if (current.length() == 6) {
                if (segmentsInCommon(current, correct[4]) == 4)
                    correct[9] = current;
                else if (segmentsInCommon(current, correct[1]) == 1)
                    correct[6] = current;
                else
                    correct[0] = current;
            }
        }
        return correct;
    }

    public static int segmentsInCommon(String testing, String known) {
        int common = 0;
        for (int i=0; i<testing.length(); i++) {
            if (known.indexOf(testing.charAt(i)) >= 0)
                common++;
        }
        return common;
    }

}
