import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DaySixPartOne {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> fish = new ArrayList<>();
        Scanner scan = new Scanner(new File("files/lanternfish.txt"));
        String[] rawFish = scan.nextLine().split(",");
        scan.close();
        for (String f : rawFish)
            fish.add(Integer.parseInt(f));

        for (int day=0; day<80; day++) {
            // Since the ArrayList is dynamic, you can't just add 8 to the end. It will keep looping
            // and subtract one. Keep track of how many fish went to 0, then add that many 8's at the end.
            int fishToAdd = 0;
            for (int i=0; i<fish.size(); i++) {
                if (fish.get(i) == 0) {
                    fish.set(i, 6);
                    fishToAdd++;
                }
                else
                    fish.set(i, fish.get(i)-1);
            }
            for (int j=0; j<fishToAdd; j++)
                fish.add(8);
        }


        System.out.println(fish.size());
    }
}
