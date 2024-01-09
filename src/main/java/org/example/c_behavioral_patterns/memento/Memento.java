package org.example.c_behavioral_patterns.memento;

public class Memento {
    String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}