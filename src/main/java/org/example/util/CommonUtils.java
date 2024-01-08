package org.example.util;

public class CommonUtils {
    public static void display(String text) {
        System.out.println(text);
    }

    public static void display(Object ...object) {
        StringBuffer stringBuffer = new StringBuffer();

        for (Object obj : object) {
            stringBuffer.append(obj).append(" ");
        }

        System.out.println(stringBuffer);
    }
}
