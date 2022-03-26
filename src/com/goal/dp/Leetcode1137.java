package com.goal.dp;

public class Leetcode1137 {

    public static int tribonacci(int n) {

        int a = 0,b = 1,c = 1,res;

        if (n == 0){
            return a;
        } else if (n == 1 || n == 2){
            return b;
        }

        // 本题和斐波那契数列相似
        // Tn+3 = Tn+2 + Tn+1 + Tn
        // 只用求得 Tn 的值,然后让 a ,b ,c 前进即可
        for (int i = 3;i <= n;i ++){
            res = a + b + c;
            a = b;
            b = c;
            c = res;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

}
