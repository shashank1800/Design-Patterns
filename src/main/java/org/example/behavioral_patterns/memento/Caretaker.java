package org.example.behavioral_patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    // State stack
    private List<Memento> states = new ArrayList<>();

    public void push(Memento memento) {
        states.add(memento);
    }

    public Memento pop() {
        return states.remove(states.size() - 1);
    }

}
