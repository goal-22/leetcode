package com.goal.search;

import java.util.HashMap;
import java.util.Set;

public class Leetcode169 {

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i ++){
            if (! map.containsKey(nums[i])){
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
/*        for (int i = 0;i < nums.length;i ++){
            if (map.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }*/
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            if (map.get(integer) > nums.length/2){
                return integer;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {8,8,7,7,7};
        System.out.println(majorityElement(nums));
    }

}
