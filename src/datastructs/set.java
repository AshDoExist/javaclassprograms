package datastructs;

import java.util.*;

public class set {
    public static void main(String[] args) {
        Set<Integer> st1 = new LinkedHashSet<>();     // in order
/*
        Set<Integer> st1 = new HashSet<>();           // ascending order
        Set<Integer> st1 = new TreeSet<>();           // thread safety + ascending order
*/

        st1.add(5);
        st1.add(6);
        st1.add(1);
        st1.add(4);
        System.out.println(st1);
    }
}
