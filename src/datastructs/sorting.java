package datastructs;

import java.util.*;

class A implements Comparator<Integer> {
    @Override
    public int compare(Integer i, Integer j) {
        if (i % 10 > j % 10) {
            return 1;
        }
        return -1;
    }
}

class AB implements Comparator<String> {
    @Override
    public int compare(String i, String j) {
        int l1 = i.length();
        int l2 = j.length();
        if (l1 > l2) {
            return 1;
        }
        else if (l1 < l2) {
            return -1;
        }
        else {
            return 0;
        }
    }
}

public class sorting {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();
//        arr.add(19);
//        arr.add(28);
//        arr.add(35);
//        arr.add(45);
//        arr.add(88);
//        arr.add(67);
//        System.out.println("Original: \t\t" + arr);
//        Collections.sort(arr);
//        System.out.println("Sorted: \t\t" + arr);
//        Collections.sort(arr, new A());
//        System.out.println("Custom Sorting: " + arr);

        List<String> arr = new ArrayList<>();
        arr.add("Harsh");
        arr.add("Krish");
        arr.add("Ayush");
        arr.add("Arnav");
        arr.add("Ameera");
        arr.add("Diya");

        System.out.println("Original: \t\t" + arr);
        Collections.sort(arr);
        System.out.println("Sorted: \t\t" + arr);
        Collections.sort(arr, new AB());
        System.out.println("Custom Sorting: " + arr);


    }
}
