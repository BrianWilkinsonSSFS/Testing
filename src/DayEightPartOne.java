import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayEightPartOne {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("files/digits.txt"));
        int total = 0;
        while (scan.hasNextLine()) {
            String output = scan.nextLine();
            int line = output.indexOf("|");
            output = output.substring(line+2);
            String[] digits = output.split(" ");
            for (String word : digits) {
                if (word.length() == 7 || word.length() == 4 || word.length() == 2 || word.length() == 3)
                    total++;
            }

        }
        scan.close();
        System.out.println(total);
    }
}
