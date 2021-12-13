import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DayTwoPartOne {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/position.txt"));
        int horizontal = 0;
        int depth = 0;
        while (scan.hasNextLine()) {
            String direction = scan.next();
            int magnitude = scan.nextInt();
            if (direction.equals("up"))
                depth -= magnitude;
            else if (direction.equals("down"))
                depth += magnitude;
            else
                horizontal += magnitude;
        }
        System.out.println(horizontal * depth);
    }
}
