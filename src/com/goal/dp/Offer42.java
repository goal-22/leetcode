package com.goal.dp;

public class Offer42 {

    public static int maxSubArray(int[] nums) {

        // 需要记录最后一个为当前元素的子序列，所以长度为 nums.length
        // 这种方式的空间复杂度为 O(N)  跟数组的长度有关系
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];

        /**
         状态转移方程:
         dp[i] = nums[i] , dp[i - 1] < 0
         dp[i] = dp[i - 1] + nums[i] , dp[i - 1] >= 0
         */
        //  数组的第一个元素只有他自己这么一个子数组，所以不用放入循环内
        for (int i = 1;i < nums.length;i ++){
            dp[i] = nums[i] +  Math.max(0 , dp[i - 1]);
            res = Math.max(res,dp[i]);
        }
        return res;
    }

    /**
     * 优化后的算法(降低空间复杂度)
     * @param nums
     * @return
     */
    public static int maxSubArray1(int[] nums) {
        int res = nums[0];
        /**
         状态转移方程:
         dp[i] = nums[i] , dp[i - 1] < 0
         dp[i] = dp[i - 1] + nums[i] , dp[i - 1] >= 0
         */
        //  数组的第一个元素只有他自己这么一个子数组，所以不用放入循环内
        for (int i = 1;i < nums.length;i ++){
            nums[i] = nums[i] + Math.max(0,nums[i - 1]);
            res = Math.max(res,nums[i]);
        }
        return res;
    }


    public static void main(String[] args) {
        int[]  nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray1(nums));
    }

}
