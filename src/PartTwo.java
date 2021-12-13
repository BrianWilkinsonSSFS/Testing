import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class PartTwo {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/depths.txt"));
        int[] values = new int[2000];
        int count = 0;
        while (scan.hasNextInt()) {
            values[count] = scan.nextInt();
            count++;
        }
        int increased = 0;
        int previous = values[0] + values[1] + values[2];
        for (int i=0; i<values.length-2; i++) {
            int current = values[i] + values[i+1] + values[i+2];
            if (current > previous)
                increased++;
            previous = current;
        }
        System.out.println(increased);

    }
}
