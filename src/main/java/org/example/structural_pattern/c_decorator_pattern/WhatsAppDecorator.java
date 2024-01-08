package org.example.structural_pattern.c_decorator_pattern;

import org.example.util.CommonUtils;

public class WhatsAppDecorator extends BaseDecorator {


    WhatsAppDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send() {
        super.send();
        CommonUtils.display("Sending message in whatsapp now");
    }
}
