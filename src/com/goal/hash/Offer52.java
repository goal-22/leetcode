package com.goal.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Offer52 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /**
         * 创建一个 hash 表用于存放两个链表中其中一个链表的所有节点
         * 再遍历另外一个链表，在哈希表中存在就返回该节点
         * (找到第一个公共节点，如图所示:在第一个公共节点之后的所有节点
         * 都是同一个节点,即是同一个对象,所以在找到第一个共同节点之后可以直接返回)
         * 若遍历完都不存在就返回为 null
         */
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null){
            if (set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
