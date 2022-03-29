package com.goal.hash;

import java.util.HashMap;

public class Offer35 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        // 用于存放每个节点
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        //  遍历链表将链表值对应一个新的链表节点
        while(temp != null){
            map.put(temp,new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        //  再次循环  将新链表的每个节点的关系映射起来
        while (temp != null){
            map.get(temp).next = map.get(temp.next);
            map.get(temp).random = map.get(temp.random);
            temp = temp.next;
        }
        return map.get(head);
    }
}
