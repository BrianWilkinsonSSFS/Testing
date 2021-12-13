import java.util.ArrayList;

public class RecursionTest {

    private String x;
    public void feed(String number)
    {
        if (x == null || x.compareTo(number) < 0)
            x = number;
    }

    public String get() {
        return x;
    }



    public static void main(String[] args) {
        RecursionTest bfg = new RecursionTest();
        String[] numbers = {"One", "Two", "Three", "Four", "Five",
                "Six" , "Seven", "Eight", "Nine", "Ten"};
        for (String number : numbers)
            bfg.feed(number);
        System.out.println(bfg.get());
        ArrayList<String> names = new ArrayList<String>();
}

}



