import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DaySevenPartTwo {

    private static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/crabs.txt"));
        String[] crabPos = scan.nextLine().split(",");
        int[] fuel = new int[crabPos.length];
        scan.close();

        for (int i=0; i< crabPos.length; i++) {
            fuel[i] = Integer.parseInt(crabPos[i]);
        }
        int max = findMax(fuel);
        int minFuel = Integer.MAX_VALUE;
        int finalPos = 0;
       while (finalPos <= max) {
            int total = 0;
            for (int k=0; k<fuel.length; k++) {
                int n = Math.abs(fuel[k]-finalPos);
                total += (n * (n + 1)) / 2;
                if (total > minFuel)
                    break;
            }
            if (total < minFuel)
                minFuel = total;
            finalPos++;
        }
        System.out.println(minFuel);
    }
}
