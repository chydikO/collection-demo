package org.itstep;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> simpleMap = new HashMap<>();

        Map<Point, String> pointStringMap = new HashMap<>();
        pointStringMap.put(new Point(1, 1), "(1, 1)");
        pointStringMap.put(new Point(0, 0), "(0, 0)");
        pointStringMap.put(new Point(0, 0), "(0, 0)");

        Collection<String> values = pointStringMap.values();
        System.out.println("values = " + values);
        Set<Point> points = pointStringMap.keySet();
        System.out.println("points = " + points);
        Set<Map.Entry<Point, String>> entries = pointStringMap.entrySet();
        System.out.println("entries = " + entries);

        System.out.println(pointStringMap);

        Student2 student2 = new Student2("Вася", "Пупкін", 12);
        System.out.println(student2);
    }
}

record Student2(
        String firstName,
        String lastName,
        int age
) implements Comparable<Student2> {

    @Override
    public int compareTo(Student2 o) {
        int compareFistName = Objects.compare(firstName, o.firstName, String::compareTo);
        int compareLastName = Objects.compare(lastName, o.lastName, String::compareTo);
        int compareAge = age - o.age;
        return compareFistName == 0 ?
                (compareLastName == 0 ? compareAge : compareLastName)
                : compareFistName;
    }
}

