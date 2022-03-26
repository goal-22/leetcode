package com.goal.dp;

import java.util.Arrays;

/**
 * 该题可以分为三种情况
 * 1. 偷第一家，不偷最后
 * 2. 偷最后一家，不偷第一家
 * 3. 第一家和最后一家都不偷
 * 很明显最后一种情况偷的金额总数比第一种和第二种情况都要少
 * 所以，编写一个函数来判断第一种情况和第二种情况哪一种偷的金额多
 */
public class Leetcode213 {

    public static int getMax(int[] nums){

        if (nums.length < 2){
            return nums[0];
        } else if (nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int a = nums[0],b = Math.max(nums[0],nums[1]),temp;
        for (int i = 2;i < nums.length;i ++){
            temp = Math.max(nums[i] + a,b);
            a = b;
            b = temp;
        }
        return b;
    }

    public static int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int[] removeFirst = Arrays.copyOfRange(nums,1,nums.length);
        int[] removeLast = Arrays.copyOfRange(nums,0,nums.length - 1);
        int a = getMax(removeFirst),b = getMax(removeLast);
        return Math.max(a,b);
    }
    public static void main(String[] args) {
        int[] nums = {1};
        int[] nums1 = {2,3,2};
        System.out.println(rob(nums));
        System.out.println(rob(nums1));
    }
}
