package org.itstep;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Collections.shuffle(list);
        System.out.println("list = " + list);
//        Collections.sort(list);
        list.sort(String::compareTo);
        System.out.println("list = " + list);

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
//        integers.add(6);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        list1.add(6);
        System.out.println(list1);
    }
}
