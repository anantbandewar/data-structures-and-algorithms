// Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/


class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int day=1; day<prices.length; day++) {
            profit += Math.max(prices[day] - prices[day-1], 0);
        }

        return profit;
    }
}