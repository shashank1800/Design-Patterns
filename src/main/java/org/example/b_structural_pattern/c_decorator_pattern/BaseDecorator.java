package org.example.b_structural_pattern.c_decorator_pattern;

public class BaseDecorator implements Notifier {

    private Notifier notifier;

    BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send() {
        notifier.send();
    }
}
