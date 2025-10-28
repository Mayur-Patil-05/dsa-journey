package Arrays;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr) {
        int left = 0;
        for (int right = 1; right < arr.length; right++) {
            if (arr[left] > arr[right]) {
                return false;
            }
            left++;
        }
        return true;
    }
}
