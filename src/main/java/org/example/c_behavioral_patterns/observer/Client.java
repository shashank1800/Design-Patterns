package org.example.c_behavioral_patterns.observer;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.openFile();
        editor.saveFile();
    }
}
