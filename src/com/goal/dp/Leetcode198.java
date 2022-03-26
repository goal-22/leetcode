package com.goal.dp;

public class Leetcode198 {

    public static int rob(int[] nums) {

        if (nums.length == 0 || nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int a = nums[0], b = Math.max(nums[0], nums[1]), temp;
        for (int i = 2; i < nums.length; i++) {
            temp = Math.max(nums[i] + a, b);
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

}
