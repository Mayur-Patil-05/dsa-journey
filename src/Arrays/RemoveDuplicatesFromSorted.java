package Arrays;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] arr) {
        int left = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[left]) {
                left++;
                arr[left] = arr[i];
            }
        }
        return left + 1;
    }
}
