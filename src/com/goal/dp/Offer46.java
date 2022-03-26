package com.goal.dp;

public class Offer46 {

    public static int translateNum(int num) {

        // 状态定义 dp[i] 代表以第 i 个数字结尾的翻译方案数量
        // 因为 dp[i] 只与 dp[i - 1] 和 dp[i - 2] 有关
        // 所以只用定义三个变量，a 代表第 i - 2 个数字,b 代表第 i - 1 个数字,c代表第 i 个数字
        int a, b, c;
        // 初始条件 第零个和第一个翻译方案都是 1
        a = b = 1;
        String str = String.valueOf(num);
        // 状态转移方程
        // 因为已经定义了初始条件(即第一个和第二个数字,所以循环变量 i 从 2 开始)
        for (int i = 2; i <= str.length(); i++) {
            String temp = str.substring(i - 2, i);
            c = temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0 ? a + b : b;
            // a , b 前进
            a = b;
            b = c;
        }
        // 返回值
        return b;
    }


    public static void main(String[] args) {
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(translateNum(12258));
    }

}
