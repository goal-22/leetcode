package com.goal.dp;

public class Offer10I {

    public static int fib(int n) {

        // a 是 f(0),b 是 f(1),sum 是求 f(n) 的值
        int a = 0,b = 1,sum = 0;
        for (int i = 0;i < n;i ++){
            // 因为 i 是从 0 开始循环,所以sum求的值是 f(n+1)
            // 防止超出范围
            sum = (a + b) % 1000000007;
            // a , b 前进
            a = b;
            b = sum;
        }

        return a;

    }

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}
