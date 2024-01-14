package org.example.c_behavioral_patterns.c_iterator;


public class ArrayList implements IterableCollection {

    int arr[] = new int[20];

    int size = 0;

    @Override
    public Iterator createIterator() {
        return new ListIterator(arr, size);
    }

    void add(Integer data) {
        arr[size++] =  data;
    }


}
