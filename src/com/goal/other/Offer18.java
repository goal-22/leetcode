package com.goal.other;

public class Offer18 {

    public ListNode deleteNode(ListNode head, int val) {
        //  如果链表为空,返回 null 即可
        if (head == null) {
            return null;
        }
        //  如果需要删除的值在头部,则删除头部节点
        //  即将头部指针指向第二个节点
        if (head.val == val) {
            return head.next;
        }
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == val){
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
