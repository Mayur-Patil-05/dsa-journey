package Matrix;

import java.util.ArrayList;
import java.util.List;

public class WaveMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(wave(arr));
    }

    public static List<Integer> wave(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        List<Integer> ans = new ArrayList<>();

        for (int j = 0; j < cols; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < rows; i++) {
                    ans.add(arr[i][j]);
                }
            } else {
                for (int i = rows - 1; i >= 0; i--) {
                    ans.add(arr[i][j]);
                }
            }
        }
        return ans;
    }
}
