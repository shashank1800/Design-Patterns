package org.example.c_behavioral_patterns.c_iterator;

import org.example.util.CommonUtils;

import java.util.ArrayList;
import java.util.Iterator;

public class Client2 {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            CommonUtils.display(iterator.next());
        }
    }
}
