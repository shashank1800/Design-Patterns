package org.example.structural_pattern.c_decorator_pattern;

import org.example.util.CommonUtils;

public class DigiiDecorator extends BaseDecorator {
    DigiiDecorator(Notifier notifier) {
        super(notifier);
    }


    @Override
    public void send() {
        super.send();

        CommonUtils.display("Sending message in Digii now");
    }
}
