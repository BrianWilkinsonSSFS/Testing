import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DaySevenPartOne {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("files/sample.txt"));
        String[] crabPos = scan.nextLine().split(",");
        int[] fuel = new int[crabPos.length];
        scan.close();

        for (int i=0; i< crabPos.length; i++) {
            fuel[i] = Integer.parseInt(crabPos[i]);
        }
        int minFuel = Integer.MAX_VALUE;
        for (int j=0; j< fuel.length; j++) {
            int total = 0;
            int finalPos = fuel[j];
            for (int k=0; k<fuel.length; k++) {
                total += Math.abs(fuel[k]-finalPos);
                if (total > minFuel)
                    break;
            }
            if (total < minFuel)
                minFuel = total;
        }
        System.out.println(minFuel);
    }
}
