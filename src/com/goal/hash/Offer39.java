package com.goal.hash;

import java.util.HashMap;

public class Offer39 {

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i < nums.length;i ++){
            if (! map.containsKey(nums[i])){
                map.put(nums[i],1);
            } else {
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(a));
    }

}
