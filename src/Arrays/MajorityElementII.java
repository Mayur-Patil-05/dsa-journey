package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }

    public static List<Integer> majorityElement(int[] arr) {
        int count1 = 0, count2 = 0;
        int majority1 = 0, majority2 = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority1) {
                count1++;
            } else if (arr[i] == majority2) {
                count2++;
            } else if (count1 == 0) {
                majority1 = arr[i];
                count1 = 1;
            } else if (count2 == 0) {
                majority2 = arr[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == majority1) {
                count1++;
            } else if (arr[i] == majority2) {
                count2++;
            }
        }

        int n = arr.length;
        if (count1 > n / 3) result.add(majority1);
        if (count2 > n / 3) result.add(majority2);
        return result;
    }
}
