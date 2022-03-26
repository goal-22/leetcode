package com.goal.dp;

public class Offer10II {

    public static int numWays(int n) {

        // 因为有第零级台阶,所以一共有 n+1 级台阶的跳法需要记录
        int[] dp = new int[n + 1];

        // 初始化第零级台阶和第一级台阶
        if (n == 0){
            dp[0] = 1;
        } else if (n > 0) {
            dp[0] = 1;
            dp[1] = 1;
        }

        for (int i = 2;i <= n;i ++){
            // 状态转移方程为: f(n) = f(n - 1) + f(n - 2)
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        // 返回第n级台阶的跳法
        return dp[n];

    }

    /**
     * 优化后的算法
     * @param n
     * @return
     */
    public static int numWays1(int n) {
//        a,b 分别为第零级台阶和第一级台阶
        int a = 1, b = 1;
//        用于暂存a的值
        int temp;
        for (int i = 2; i <= n; i++) {
            temp = a;
//            a , b 前进
            a = b;
            b = (b + temp) % 1000000007;
        }
        return b;
    }


    public static void main(String[] args) {
        System.out.println(numWays(7));
        System.out.println(numWays1(7));
    }
}
