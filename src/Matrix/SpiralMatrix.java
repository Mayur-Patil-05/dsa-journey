package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> res = spiralOrder(arr);
        System.out.println(res);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        int totalElements = 0;

        while (totalElements < rows*cols){
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
                totalElements++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
                totalElements++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                ans.add(matrix[bottom][i]);
                totalElements++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
                totalElements++;
            }
            left++;
        }
        return ans;
    }
}
