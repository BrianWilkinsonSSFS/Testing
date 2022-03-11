import java.util.ArrayList;

public class Test {

    static ArrayList<Integer> list;
    public static int recur(int n) {
        if (n <= 10)
            return n*2;
        else return recur(recur(n/3));
    }

    public static void main(String[] args) {
        int[][] mat = {{2, 1, 3, 4}, {9, 7, 2, 1}, {0, 2, 5, 6}};

        for (int r=1; r<mat.length; r++) {
            for (int c=1; c<mat[0].length; c++) {
                if ((r + c) % 2 == 0)
                    mat[r][c] = 2 * mat[r-1][c-1] + c;
            }
        }
        System.out.println(mat[2][2]);



    }

}
