package datastructs;

import java.util.*;

class Student {

}

public class student {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rahul"));
        list.add(new Student(2, "Amit"));
        list.add(new Student(1, "Shiv"));

        Collections.sort(list);

    }
}
