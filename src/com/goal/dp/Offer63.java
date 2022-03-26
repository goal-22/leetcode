package com.goal.dp;

public class Offer63 {

    public static int maxProfit(int[] prices) {

        if (prices.length < 2) {
            return 0;
        }
//        代表第 i 天获得的最大利润
        int[] dp = new int[prices.length];
//        第一天获得的利润为 0
        dp[0] = 0;
        int min = prices[0];
        /**
         * 思路:
         * 第 i 天最大的利润 等于 前 i - 1 天的最大利润
         * 和 当天价格减去所有天数里价格最低的那天 之间的最大值
         * dp[i] = max(dp[i - 1],price[i] - min(price[0...i-1]))
         */
        for (int i = 1; i < prices.length; i++) {
            min = Math.min(min, prices[i - 1]);
            dp[i] = Math.max(dp[i - 1], prices[i] - min);
        }
        return dp[prices.length - 1];
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
        int[] prices1 = {7,6,4,3,1};
        System.out.println(maxProfit(prices1));
    }
}
