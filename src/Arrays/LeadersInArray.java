package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr));
    }

    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length - 1];
        list.add(max);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                list.add(max);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
