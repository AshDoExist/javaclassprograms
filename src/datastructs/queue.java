package datastructs;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> st1 = new PriorityQueue<>();     // in order
/*
        Set<Integer> st1 = new HashSet<>();           // ascending order
        Set<Integer> st1 = new TreeSet<>();           // thread safety + ascending order
*/

/*
        st1.add(1);
        st1.add(2);
        st1.add(5);
        st1.add(9);
        st1.offer(4);
        System.out.println(st1.peek() + " " + st1.poll());
        System.out.println(st1.remove(2));
        System.out.println(st1);

        Queue<Integer> s = new LinkedList<>();
        s.add(22);
        s.add(24);
        st1.addAll(s);

        System.out.println(st1);
*/

        Queue<Integer> q = new PriorityQueue<>();
        q.add(9);
        q.add(8);
        q.add(7);
        q.add(6);
        q.add(5);
        System.out.println(q);

        for (Integer i:q) {
            System.out.println(i);
        }
    }
}
