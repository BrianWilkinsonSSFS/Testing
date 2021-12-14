import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayFourPartOne {

    public static int[] makeIntegerArray(String[] numbers) {
        int[] calls = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            calls[i] = Integer.parseInt(numbers[i]);
        }
        return calls;
    }
    public static int callNumbers(ArrayList<BingoCard> bc, int[] calls) {
        for (int i=0; i<calls.length; i++) {
            for (BingoCard card : bc) {
                for (int r=0; r<card.getNumRows(); r++) {
                    for (int c=0; c<card.getNumCols(); c++) {
                        if (card.getCard()[r][c].getValue() == calls[i]) {
                            card.getCard()[r][c].setCalled();
                            if (card.hasBingo())
                                return card.totalUncalled() * calls[i];
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<BingoCard> bc = new ArrayList<>();

        Scanner scan = new Scanner(new File("files/bingo_data.txt"));
        String line = scan.nextLine();
        String[] input = line.split(",");
        int[] calledNumbers = makeIntegerArray(input);

        while (scan.hasNextLine()) {
            scan.nextLine(); // skips the blank line between each board.
            BingoNumber[][] fullCard = new BingoNumber[5][5];
            for (int row=0; row<5; row++) {
                String l = scan.nextLine();
                String[] nums = l.split(" ");
                int count = 0;
                int col = 0;
                while (col < 5) {
                    if (!nums[count].equals("")) { // To make things line up, there are spaces in the input
                        BingoNumber next = new BingoNumber(Integer.parseInt(nums[count]));
                        fullCard[row][col] = next;
                        col++;
                    }
                    count++;
                }

            }
            BingoCard card = new BingoCard(fullCard);
            bc.add(card);
        }
        System.out.println(callNumbers(bc, calledNumbers));
        scan.close();
    }
}
