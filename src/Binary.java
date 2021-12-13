public class Binary {

    public static int search(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == num)
                return mid;
            else if (arr[mid] > num)
                max = mid - 1;
            else
                min = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] testing = {3, 14, 23, 25, 32, 37, 39, 44, 56, 61, 62, 78, 89, 90};
        System.out.println(search(testing, 120));
    }
}
