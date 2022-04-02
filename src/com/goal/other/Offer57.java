package com.goal.other;

import java.util.HashSet;

/**
 * @Author: Goal
 * @Date: 2022/4/1 12:02
 */
public class Offer57 {

    /**
     * 经过两次循环
     * 时间复杂度太高
     * @param nums
     * @param target
     * @return
     */
    public int[] myTwoSum(int[] nums, int target) {

        if (nums.length == 0 || nums == null){
            return null;
        }
        int[] sum = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0;i < nums.length;i ++){
            if (! set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        for (Integer i : set) {
            if (set.contains(target - i)){
                set.remove(i);
                sum[0] = target - i;
                sum[1] = i;
            }
        }
        return sum;
    }

    /**
     * 双指针解法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {

        int i = 0,j = nums.length - 1;
        while (i < j){
            int sum = nums[i] + nums[j];
            //  数组递增
            if (sum > target){
                j --;
            } else if (sum < target){
                i ++;
            } else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }

}
