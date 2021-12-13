import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Depth {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/depths.txt"));
        int increase = 0;
        int previous = scan.nextInt();
        while (scan.hasNextInt()) {
            int current = scan.nextInt();
            if (current > previous)
                increase++;
            previous = current;
        }
        System.out.println(increase);
    }
}
