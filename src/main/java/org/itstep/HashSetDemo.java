package org.itstep;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //demo01();

        Set<Student> group = new LinkedHashSet<>();
        Student firstStudent = new Student("Вася", "Пупкін", 21);
        group.add(firstStudent);
        Student secondStudent = new Student("Маша", "Ефросініна", 37);
        group.add(secondStudent);
        Student thirdStudent = new Student("Рома", "Руденко", 19);
        group.add(thirdStudent);
        Student fourthStudent = new Student("Вася", "Пупкін", 12);
        group.add(fourthStudent);
        System.out.println("firstStudent.hashCode() = " + firstStudent.hashCode());
        System.out.println("secondStudent.hashCode() = " + secondStudent.hashCode());
        System.out.println("thirdStudent.hashCode() = " + thirdStudent.hashCode());
        System.out.println("fourthStudent.hashCode() = " + fourthStudent.hashCode());
        System.out.println(group.size());
        System.out.println("group = " + group);
        group.remove(new Student("Вася", "Пупкін", 12));
        System.out.println(group.size());
        System.out.println("group = " + group);
    }

    private static void demo01() {
        Set<String> set = new HashSet<>();
        set.add("first");
        set.add("first");
        set.add("second");
        set.add("third");
        System.out.println("set = " + set);
    }
}

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return 32 * x ^ y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point p) {
            return p.x == x && p.y == y;
        }
        return super.equals(obj);
    }
}

class Student {
    private final String firstName;
    private final String lastName;
    private final int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student s) {
            return Objects.equals(firstName, s.firstName);
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + firstName + '\'' +
                '}';
    }
}
