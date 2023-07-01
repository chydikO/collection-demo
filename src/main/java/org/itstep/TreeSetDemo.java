package org.itstep;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    enum Status {
        NEW, IN_PROGRESS, DONE
    }

    static class TodoItem implements Comparable<TodoItem> {
        private String title;
        private Status status;

        public TodoItem(String title) {
            this(title, Status.NEW);
        }

        public TodoItem(String title, Status status) {
            this.title = title;
            this.status = status;
        }

        @Override
        public String toString() {
            return "TodoItem{" +
                    "title='" + title + '\'' +
                    ", status=" + status +
                    '}';
        }

        @Override
        public int compareTo(TodoItem o) {
            return title.compareTo(o.title) + (status.ordinal() - o.status.ordinal());
        }
    }

    final static class Car {
        private String model;

        public Car(String model) {
            this.model = model;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//        demo01();
        Comparator<Car> carComparator = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.model.compareTo(o2.model);
            }
        };
        Set<Car> cars = new TreeSet<>(carComparator);
        cars.add(new Car("Mazda"));
        cars.add(new Car("Tesla"));
        cars.add(new Car("Mercedes"));
        cars.add(new Car("Mercedes"));

        System.out.println("cars = " + cars);
    }

    private static void demo01() {
        Set<TodoItem> todoList = new TreeSet<>();
        todoList.add(new TodoItem("Learn Java Collection Framework"));
        todoList.add(new TodoItem("Go for a walk"));
        todoList.add(new TodoItem("Buy a products"));
        todoList.add(new TodoItem("Learn Java Collection Framework", Status.NEW));

        System.out.println("todoList = " + todoList);
    }
}
