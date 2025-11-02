package Arrays;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr) {
        int buyPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (buyPrice > arr[i]) {
                buyPrice = arr[i];
            } else {
                int currProfit = arr[i] - buyPrice;
                if (currProfit > maxProfit) {
                    maxProfit = currProfit;
                }
            }
        }
        return maxProfit;
    }
}
