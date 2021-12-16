import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DayFivePartTwo {
    private static Set<Point> duplicates = new HashSet<>();

    public static void addDiagonalPoints(Point p1, Point p2, Set<Point> points) {
        int distance = Math.abs(p1.x - p2.x);
        if (p1.y < p2.y) {
            for (int i=1; i<=distance; i++) {
                Point newP = new Point(p1.x+i, p1.y+i);
                if (!points.add(newP)) {
                    duplicates.add(newP);
                }
            }
        } else {
            for (int j=1; j<=distance; j++) {
                Point newP = new Point(p1.x+j, p1.y-j);
                if (!points.add(newP)) {
                    duplicates.add(newP);
                }
            }
        }
    }

    public static void addPointsToSet(Point p1, Point p2, Set<Point> points) {

        // Get all the points on the line, add to the set.
        if (p1.x == p2.x) { //Vertical line
            int low = p1.y;
            int high = p2.y;
            if (p2.y < p1.y) {
                low = p2.y;
                high = p1.y;
            }
            for (int i=low; i<=high; i++) {
                Point newP = new Point(p1.x, i);
                if (!points.add(newP)) {
                    duplicates.add(newP);
                }
            }

        } else {
            int low = p1.x;
            int high = p2.x;
            if (p2.x < p1.x) {
                low = p2.x;
                high = p1.x;
            }
            for (int j=low; j<=high; j++) {
                Point newP = new Point(j, p1.y);
                if (!points.add(newP)) {
                    duplicates.add(newP);
                }
            }
        }
    }

    public static Point[] getPoints(String line) {
        // Points in the form of 565,190 -> 756,381
        int spaceOne = line.indexOf(" ");
        int spaceTwo = line.indexOf(" ", spaceOne+1);
        String pointOne = line.substring(0, line.indexOf(" "));
        String pointTwo = line.substring(spaceTwo+1);
        String[] one = pointOne.split(",");
        String[] two = pointTwo.split(",");
        Point first = new Point(Integer.parseInt(one[0]), Integer.parseInt(one[1]));
        Point second = new Point(Integer.parseInt(two[0]), Integer.parseInt(two[1]));
        return new Point[]{first, second};

    }

    public static boolean isVorH(Point one, Point two) {
        return one.x == two.x || one.y == two.y;
    }

    public static void main(String[] args) throws IOException {
        Set<Point> points = new HashSet<>();

        Scanner scan = new Scanner(new File("files/points.txt"));
        while (scan.hasNextLine()) {
            Point[] p = getPoints(scan.nextLine());
            if (isVorH(p[0], p[1]))
                addPointsToSet(p[0], p[1], points);
            else
                addDiagonalPoints(p[0], p[1], points);
        }
        scan.close();
        System.out.println(duplicates.size());
    }
}
