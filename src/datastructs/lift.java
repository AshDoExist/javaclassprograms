package datastructs;

import java.util.*;

public class lift {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.add(9);
        q.add(8);
        q.add(7);
        q.add(6);
        q.add(5);
        System.out.println(q);

        for (Integer i:q) {
            System.out.println(i);
        }

        Queue<Integer> q2 = new ArrayDeque<>();
        q2.add(45);

    }
}
