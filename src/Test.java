public class Test {

    public static void doStuff(int num1, int num2) {
        for (int i=0; i<num1; i++) {
            if (i%num2==0 && i%4 == 2)
                System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        int x = 0;
        for (int y=1; y<=10; y++) {
            for (int z=y; z<=10; z++) {
                x++;
            }
        }
        System.out.println(x);
    }

}
