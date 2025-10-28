package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 11, 7};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
