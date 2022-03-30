package com.goal.hash;

import java.util.HashMap;

public class Offer53 {

    public static int search(int[] nums, int target) {

        if (nums.length == 0 && nums == null){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        if (map.containsKey(target)){
            return map.get(target);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums, 8));
    }
}
