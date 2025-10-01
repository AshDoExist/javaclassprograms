package datastructs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> q2 = new ArrayDeque<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        System.out.println(q2);
        q2.addLast(5);
        q2.addFirst(5);
        System.out.println(q2);
        q2.removeFirst();
        System.out.println(q2);
    }
}
