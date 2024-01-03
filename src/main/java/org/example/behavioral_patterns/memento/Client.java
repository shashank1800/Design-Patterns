package org.example.behavioral_patterns.memento;

import org.example.util.CommonUtils;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setContent("A");
        originator.setContent("B");

        // Hit Save -> Caretaker saves the state
        caretaker.push(originator.createState());

        // Change content
        originator.setContent("C");

        // Hit Undo -> Last state from caretaker is taken and stored in originator
        originator.restore(caretaker.pop());

        CommonUtils.display(originator.getContent());
    }
}
