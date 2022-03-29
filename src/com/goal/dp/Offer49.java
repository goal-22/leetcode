package com.goal.dp;

/**
 * 丑数动态规划做法
 */
public class Offer49 {

    public static int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        /**
         * 思路:
         *  丑数集合中每个数的形成是由前面某一个数 * 2 or 3 or 5
         *  所以使用 a ,b ,c 三个变量用于存放第 i 个丑数的位置
         *  当已经使用过这三个变量中的其中一个时，就让它自增
         *  每次循环选择出三个计算结果中最小的值
         */
        int[] dp = new int[n];
        dp[0] = 1;
        //  用于记录当前指向了 dp 数组中的哪个数
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) a ++;
            if (dp[i] == n3) b ++;
            if (dp[i] == n5) c++;
        }
        return dp[n - 1];
    }
}
