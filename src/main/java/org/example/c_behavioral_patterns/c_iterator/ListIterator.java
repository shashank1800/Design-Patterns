package org.example.c_behavioral_patterns.c_iterator;

public class ListIterator implements Iterator{

    int[] data;
    int cursor = 0;
    int size = 0;

    ListIterator(int[] list, int size) {
        this.data = list;
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return cursor != size;
    }

    @Override
    public Integer next() {
        return data[cursor++];
    }
}
