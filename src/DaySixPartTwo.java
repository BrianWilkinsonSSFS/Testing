import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaySixPartTwo {

    public static void main(String[] args) throws IOException {
        long[] fish = new long[9];
        Scanner scan = new Scanner(new File("files/lanternfish.txt"));
        String[] rawFish = scan.nextLine().split(",");
        scan.close();
        for (String f : rawFish) {
            Integer num = Integer.parseInt(f);
            fish[num]++;
        }

        for (int day=0; day<256; day++) {
            long temp0 = fish[0];
            fish[0] = 0;
             for (int i=1; i< fish.length; i++) {
                fish[i-1] += fish[i];
                fish[i] = 0;
            }
            fish[8] += temp0;
            fish[6] += temp0;

        }
        long total = 0;
        for (int k=0; k<fish.length; k++)
            total += fish[k];
        System.out.println(total);
    }
}
