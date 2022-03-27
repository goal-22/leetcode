package com.goal.search;

import java.util.HashSet;

public class Offer53 {

    public static int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int res = -1;
        for (int i = 0;i <= nums.length;i ++){
            if (! set.contains(i)){
                res = i;
            }
        }
        return res;
    }


}
