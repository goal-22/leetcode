package com.goal.dp;

public class Leetcode53 {

    public static int maxSubArray(int[] nums) {

        if (nums.length < 2){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1;i < nums.length;i ++){
            dp[i] = nums[i] + Math.max(0,dp[i - 1]);
            res = Math.max(res,dp[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
