package com.goal.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (! set.contains(num)){
                set.add(num);
            } else {
                set.remove(num);
            }
        }
        return (int)set.toArray()[0];
    }

}
