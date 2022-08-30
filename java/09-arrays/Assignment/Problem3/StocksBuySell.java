// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// same as 09-arrays/StocksBuySell.java

public class StocksBuySell {
  public static int sellStocks(int[] prices) {

    // Time Complexity : O(n)
    int buyPrice = prices[0];
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(profit, maxProfit);
      } else {
        buyPrice = prices[i];
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4}; // 5
    System.out.println(sellStocks(prices));
  }
}
