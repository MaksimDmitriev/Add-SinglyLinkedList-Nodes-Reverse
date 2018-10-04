package com.app;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public SinglyLinkedList addDigits(SinglyLinkedList l1, SinglyLinkedList l2) {
        Deque<Integer> d1 = toDeque(l1);
        Deque<Integer> d2 = toDeque(l2);

        SinglyLinkedList result = new SinglyLinkedList();
        int k = 0;
        while (!d1.isEmpty() && !d2.isEmpty()) {
            int v1 = d1.pop();
            int v2 = d2.pop();
            int sum = v1 + v2 + k;
            k = 0;
            if (sum > 10) {
                sum -= 10;
                k = 1;
            }
            result.prepend(sum);
        }

        while (!d2.isEmpty()) {
            result.prepend(d2.pop() + k);
            k = 0;
        }

        while (!d1.isEmpty()) {
            result.prepend(d1.pop() + k);
            k = 0;
        }

        if (k == 1) {
            result.prepend(1);
        }

        return result;
    }

    private Deque<Integer> toDeque(SinglyLinkedList list) {
        Deque<Integer> deque = new ArrayDeque<>();

        Node node = list.head.next;
        while (node != null) {
            deque.addFirst(node.val);
            node = node.next;
        }
        return deque;
    }

    public static class SinglyLinkedList {

        private int size = 0;
        private Node head = new Node(0); // dummy node
        private Node tail = head; // not a dummy node

        void append(int val) {
            Node node = new Node(val);
            tail.next = node;
            tail = tail.next;
            size++;
        }

        void prepend(int val) {
            Node node = new Node(val);
            node.next = head.next;
            head.next = node;
            size++;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof SinglyLinkedList)) {
                return false;
            }
            SinglyLinkedList other = (SinglyLinkedList) o;
            Node node = head.next;
            Node otherNode = other.head.next;
            while (node != null && otherNode != null) {
                if (node.val == otherNode.val) {
                    node = node.next;
                    otherNode = otherNode.next;
                } else {
                    return false;
                }
            }
            return node == null && otherNode == null;
        }

        @Override
        public int hashCode() {
            int res = 17;
            Node node = head.next;
            while (node != null) {
                res = 31 * res + node.val;
                node = node.next;
            }
            return res;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("[");
            Node node = head.next;
            while (node != null) {
                builder.append(node.val);
                if (node.next != null) {
                    builder.append(" > ");
                }
                node = node.next;
            }
            builder.append("]");
            return builder.toString();
        }
    }

    public static class Node {

        Node next;
        int val;

        Node(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }
}
