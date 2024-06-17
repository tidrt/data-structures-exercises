package com.studies.exercises;

import problems.BalanceSymbols;
import problems.ReverseQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        System.out.println(BalanceSymbols.solve("2*(3+4+5*[2+3)]"));
//        System.out.println(BalanceSymbols.solve("2*(3+4+5*[2+3])"));
//        System.out.println(BalanceSymbols.solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6*[5+8]+17)+2"));

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(ReverseQueue.reverseFirstK(queue, 2));
    }
}