package org.example.behavioral_patterns.memento;

public class Originator {
    String content;

    public Memento createState() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}