package com.goal.bit;

public class Offer15 {

    public int hammingWeight(int n) {

        /**
         * 使用位运算
         * 将最后一位和 1 相与
         * 若该位为 1 则相与的结果为 1
         * 若该位为 0 则相与的结果为 0
         */

        int res = 0;
        while (n != 0){
            res += n & 1;
            //  将 n 使用无符号右移一位
            n >>>= 1;
        }
        return res;
    }

}
