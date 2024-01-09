package org.example.b_structural_pattern.a_adapter_pattern;

import org.example.util.CommonUtils;

public class LegacyLibrary {
    String get(String url) {
        return "API Data";
    }

    void post(String url, String data) {
        CommonUtils.display("User Added");
    }
}
