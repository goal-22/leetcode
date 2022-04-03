package com.goal.other;

import java.util.HashSet;

/**
 * @Author: Goal
 * @Date: 2022/4/3 11:16
 */
public class Offer61 {

    public boolean isStraight(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int max = 0,min = 14;
        for (int num : nums) {
            if (num == 0){
                continue;
            }
            max = Math.max(max,num);
            min = Math.min(min,num);
            if (set.contains(num))  return false;
            set.add(num);
        }
        return max - min < 5;
    }

}
