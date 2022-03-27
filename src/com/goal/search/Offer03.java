package com.goal.search;

import java.util.HashSet;

public class Offer03 {

    public static int findRepeatNumber(int[] nums) {
        /**
         * 使用哈希表存储数据
         * 没有该数据就添加
         * 有重复的数据就返回
         */
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (! set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

}
