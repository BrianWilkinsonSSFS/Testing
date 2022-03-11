import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayNinePartOne {

    private static int[][] grid;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("files/dayNine.txt"));
        String[] rows = new String[100];
        int row = 0;
        while (scan.hasNextLine()) {
            rows[row] = scan.nextLine();
            row++;
        }
        scan.close();
        grid = new int[100][rows[0].length()];
        for (int i=0; i<rows.length; i++) {
            for (int j=0; j<rows[i].length(); j++) {
                char current = rows[i].charAt(j);
                grid[i][j] = Integer.parseInt(String.valueOf(current));
            }
        }
        findTotal();
    }

    public static void findTotal() {
        int total = 0;

        for (int row=0; row< grid.length; row++) {
            for (int col=0; col< grid[0].length; col++) {
                if (isLowest(row, col)) {
                    //System.out.println("row: " + row + ", col: " + col + ", value: " + grid[row][col]);
                    total += grid[row][col] + 1;
                }

            }
        }
        System.out.println(total);
    }

    public static boolean isValid(int row, int col) {
        return row >= 0 && row < 100 && col >= 0 && col < grid[0].length;
    }

    public static boolean isLowest(int row, int col) {
        int currentVal = grid[row][col];
        if (isValid(row-1, col) && grid[row-1][col]<=currentVal)
            return false;
        if (isValid(row+1, col) && grid[row+1][col]<=currentVal)
            return false;
        if (isValid(row, col-1) && grid[row][col-1]<=currentVal)
            return false;
        if (isValid(row, col+1) && grid[row][col+1]<=currentVal)
            return false;

        return true;
    }

}
