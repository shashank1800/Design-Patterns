package org.example.b_structural_pattern.c_decorator_pattern;

public class Client {

    static boolean whatsAppEnabled = true;
    static boolean faceBookEnabled = true;
    static boolean digiiEnabled = true;

    public static void main(String[] args) {

        Notifier notifier = new BasicNotifier();

        if (whatsAppEnabled)
            notifier = new WhatsAppDecorator(notifier);

        if (faceBookEnabled)
            notifier = new FacebookDecorator(notifier);

        if (digiiEnabled)
            notifier = new DigiiDecorator(notifier);

        notifier.send();

    }
}
