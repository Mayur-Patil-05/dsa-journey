package Arrays;

//Moore's Voting Algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int count = 0, majority = 0;

        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majority = arr[i];
            }
            if (arr[i] == majority) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}
