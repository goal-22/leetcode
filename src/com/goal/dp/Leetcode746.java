package com.goal.dp;

public class Leetcode746 {

    public static int minCostClimbingStairs(int[] cost) {
        int a = 0, b = 0;
        int temp;
        // 思路:
        // 求到达第i个台阶的最小花费,有两种情况
        // 1.先到达 i-1 ,再到达 i
        // 2.到达了 i-2 ,直接跳到 i
        // 需要比较两种情况的大小
        // 状态转移方程:
        // dp[i] = min(cost[i - 1] + dp[i - 1],cost[i - 2] + dp[i - 2])
        for (int i = 2;i <= cost.length;i ++){
            temp = Math.min(cost[i - 1] + b,cost[i - 2] + a);
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

}
