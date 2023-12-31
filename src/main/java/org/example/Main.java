package org.example;

import org.example.behavioral_patterns.observer.Editor;

public class Main {
    public static void main(String[] args) {

    }

    private static void behavioralObserver() {
        Editor editor = new Editor();

        editor.openFile();
        editor.saveFile();
    }
}