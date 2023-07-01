package org.itstep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("first");
        collection.add("first");
        collection.add("second");
        collection.add("third");

        // loop collection by iterator
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // loop collection by for
        for (String item : collection) {
            System.out.println(item);
        }
        ArrayList<String> arrayList = (ArrayList<String>) collection;
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
    }
}
