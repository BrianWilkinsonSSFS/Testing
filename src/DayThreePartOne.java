import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DayThreePartOne {



    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/diagnose.txt"));
        String[] numbers = new String[1000];
        int count = 0;
        while (scan.hasNext()) {
            numbers[count] = scan.nextLine();
            count++;
        }

        int[] digits = new int[numbers[0].length()];
        for (int j=0; j<numbers.length-1; j++) {
            String word = numbers[j];
            for (int i=0; i<word.length(); i++) {
                if (word.charAt(i) == '1')
                    digits[i]++;
            }
        }
        String gamma = "";
        String epsilon = "";
        for (int k=0; k<digits.length; k++) {
            if (digits[k] > 500) {
                gamma += "1";
                epsilon += "0";
            } else {
                gamma += "0";
                epsilon += "1";
            }
        }
        int gammaDecimal = Integer.parseInt(gamma, 2);
        int epsilonDecimal = Integer.parseInt(epsilon, 2);
        System.out.println(gammaDecimal * epsilonDecimal);

    }
}
