package Arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(check(arr));
    }

    public static int check(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return arr.length;
    }
}
