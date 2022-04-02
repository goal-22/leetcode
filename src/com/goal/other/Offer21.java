package com.goal.other;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Goal
 * @Date: 2022/4/1 11:12
 */
public class Offer21 {

    /**
     * 通过 队列 / 链表 解决
     *
     * @param nums
     * @return
     */
    public static List<Integer> myExchange(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                list.offerFirst(nums[i]);
            } else {
                list.offerLast(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 5, 6, 3, 7, 9};
        /*System.out.println(myExchange(a).toString());
        System.out.println(myExchange(b).toString());*/
        System.out.println(Arrays.toString(exchange(a)));
        System.out.println(Arrays.toString(exchange(b)));
    }

    /**
     * 通过头尾两个指针解决
     * 头部指针遍历,找到第一个偶数
     * 尾部指针遍历,找到第一个奇数
     * 两者进行交换
     * 重复以上步骤,知道 i > j or j < i
     * @param nums
     * @return
     */
    public static int[] exchange(int[] nums) {
        int i = 0,j = nums.length - 1,temp = 0;
        while (i < j){
            while (nums[i] % 2 != 0 && j > i)    i ++;
            while (nums[j] % 2 == 0 && j > i)    j --;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
