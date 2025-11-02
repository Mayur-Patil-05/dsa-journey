package Arrays;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] res = rearrangeArray(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] rearrangeArray(int[] arr) {
        int[] res = new int[arr.length];
        int positveInd = 0, negativeInd = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[positveInd] = arr[i];
                positveInd += 2;
            } else {
                res[negativeInd] = arr[i];
                negativeInd += 2;
            }
        }
        return res;
    }
}
