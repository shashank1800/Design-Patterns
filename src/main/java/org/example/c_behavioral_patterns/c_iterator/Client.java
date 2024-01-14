package org.example.c_behavioral_patterns.c_iterator;


import org.example.util.CommonUtils;

public class Client {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);

        Iterator iterator = list.createIterator();

        while (iterator.hasNext()) {
            CommonUtils.display(iterator.next());
        }

    }
}
