package org.example.b_structural_pattern.a_adapter_pattern;

import org.example.util.CommonUtils;

public class LegacyLibrary {
    String getRequest(String url) {
        return "API Data";
    }

    void postRequest(String url, String data) {
        CommonUtils.display("User Added");
    }
}
