package com.app;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addFirst(1);
        d1.addFirst(2);
        d1.addFirst(3);
        System.out.println(d1.pop());
        System.out.println(d1);

    }
}
