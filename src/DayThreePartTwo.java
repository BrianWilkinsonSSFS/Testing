import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DayThreePartTwo {

    public static String[] reduce(String[] nums, int length, char digit) {
        String[] remaining = new String[length];
        int count = 0;
        for (int j=0; j<nums.length; j++) {
            if (nums[j].charAt(0) == digit) {
                remaining[count] = nums[j];
                count++;
            }
        }
        return remaining;
    }

    public static String[] readNumbers(String filename) throws IOException{
        Scanner scan = new Scanner(new File(filename));
        String[] numbers = new String[1000];
        int count = 0;
        while (scan.hasNext()) {
            numbers[count] = scan.nextLine();
            count++;
        }
        return numbers;
    }

    public static void main(String[] args) throws IOException {
        String[] numbers = readNumbers("files/diagnose.txt");
        int currentDigit = 0;
        while (numbers.length > 1) {

            int ones = 0;
            int zeros = 0;
            for (int i=0; i<numbers.length; i++) {
                if (numbers[i].charAt(currentDigit) == '1')
                    ones++;
                else
                    zeros++;
            }

            if (ones > zeros || ones == zeros) {
                numbers = reduce(numbers, ones, '1');
            }
            else {
                numbers = reduce(numbers, zeros, '0');
            }
            currentDigit++;

        }
        System.out.println(numbers[0]);

    }
}
