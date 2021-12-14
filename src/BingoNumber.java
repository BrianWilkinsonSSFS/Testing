public class BingoNumber {

    private int value;
    private boolean beenCalled;

    public BingoNumber(int value) {
        this.value = value;
        this.beenCalled = false;
    }

    public void setCalled() {
        this.beenCalled = true;
    }

    public boolean hasBeenCalled() {
        return this.beenCalled;
    }

    public int getValue() {
        return this.value;
    }
}
