package com.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void emptyLists() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        assertEquals(new Solution.SinglyLinkedList(), res);
    }

    @Test
    public void firstEmpty() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        l2.append(1);

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(1);
        assertEquals(expected, res);
    }

    @Test
    public void secondEmpty() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        l1.append(1);
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(1);
        assertEquals(expected, res);
    }

    @Test
    public void noValueToCarryOver() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        l1.append(1);
        l1.append(2);
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        l2.append(3);
        l2.append(4);

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(4);
        expected.append(6);
        assertEquals(expected, res);
    }

    @Test
    public void valueToCarryOver() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        l1.append(1);
        l1.append(7);
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        l2.append(3);
        l2.append(9);

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(5);
        expected.append(6);
        assertEquals(expected, res);
    }

    @Test
    public void valueToCarryOver2() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        l1.append(1);
        l1.append(7);
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        l2.append(9);
        l2.append(9);

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(1);
        expected.append(1);
        expected.append(6);
        assertEquals(expected, res);
    }

    @Test
    public void valueToCarryOver3() {
        Solution.SinglyLinkedList l1 = new Solution.SinglyLinkedList();
        l1.append(1);
        l1.append(7);
        Solution.SinglyLinkedList l2 = new Solution.SinglyLinkedList();
        l2.append(9);
        l2.append(9);

        Solution solution = new Solution();
        Solution.SinglyLinkedList res = solution.addDigits(l1, l2);
        Solution.SinglyLinkedList expected = new Solution.SinglyLinkedList();
        expected.append(1);
        expected.append(1);
        expected.append(6);
        assertEquals(expected, res);
    }
}