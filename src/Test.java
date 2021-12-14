public class Test {

    public static void doStuff(int num1, int num2) {
        for (int i=0; i<num1; i++) {
            if (i%num2==0 && i%4 == 2)
                System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] factors = {2, 3, 4, 7, 2, 5};
        int product = 1;

        for (int i=1; i<factors.length; i += 2) {
            int interim = factors[i] % factors[i-1];
            product *= interim;
        }


    }

}
