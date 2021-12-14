public class BingoCard {

    private BingoNumber[][] card;
    private int winningNumber;
    private boolean hasWon;

    public BingoCard(BingoNumber[][] card) {
        this.card = card;
        this.winningNumber = 1;
        this.hasWon = false;
    }

    public BingoNumber[][] getCard() {
        return this.card;
    }

    public boolean rowBingo(int row) {
        for (int col = 0; col<this.card[row].length; col++) {
            if (!this.card[row][col].hasBeenCalled())
                return false;
        }
        return true;
    }

    public boolean colBingo(int col) {
        for (int row = 0; row<this.card.length; row++) {
            if (!this.card[row][col].hasBeenCalled())
                return false;
        }

        return true;
    }

    public boolean hasBingo() {
        for (int row = 0; row<this.card.length; row++) {
            if (rowBingo(row)) {
                this.hasWon = true;
                return true;
            }

        }

        for (int col = 0; col<this.card[0].length; col++) {
            if (colBingo(col)) {
                this.hasWon = true;
                return true;
            }

        }
        return false;
    }

    public int totalUncalled() {
        int score = 0;
        for (int row=0; row<this.card.length; row++) {
            for (int col=0; col<this.card[0].length; col++) {
                if (!this.card[row][col].hasBeenCalled()) {
                    score += this.card[row][col].getValue();
                }
            }
        }
        return score;
    }

    public int getNumRows() {
        return this.card.length;
    }

    public int getNumCols() {
        return this.card[0].length;
    }

    public void setWinningNumber(int winningNumber) {
        this.winningNumber = winningNumber;
    }

    public int getWinningNumber() {
        return winningNumber;
    }

    public boolean getHasWon() {
        return hasWon;
    }
}
