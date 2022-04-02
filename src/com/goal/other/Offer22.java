package com.goal.other;

/**
 * @Author: Goal
 * @Date: 2022/4/1 11:01
 */
public class Offer22 {


    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        int length = 0;
        ListNode temp = head;
        //  遍历获得链表长度
        while (temp != null) {
            length ++;
            temp = temp.next;
        }
        temp = head;
        //  指针移动到 length - k 的位置
        for (int i = 0; i < length - k; i++) {
            temp = temp.next;
        }
        return temp;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
