package com.goal.other;

/**
 * @Author: Goal
 * @Date: 2022/4/1 11:36
 */
public class Offer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode temp = new ListNode(0),cur = temp;
        while (l1 != null && l2 !=null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        //  当两条链表长度不一样时出现没有遍历完的情况
        //  直接将剩下的链表赋值给 temp
        cur.next = l1 == null ? l2 : l1;
        return temp.next;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
