import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DayTwoPartTwo {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/position.txt"));
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        while (scan.hasNextLine()) {
            String direction = scan.next();
            int magnitude = scan.nextInt();
            if (direction.equals("up"))
                aim -= magnitude;
            else if (direction.equals("down"))
                aim += magnitude;
            else {
                horizontal += magnitude;
                depth += aim*magnitude;
            }

        }
        System.out.println(horizontal * depth);
    }
}
