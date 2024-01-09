package org.example.b_structural_pattern.a_adapter_pattern;

public interface NetworkAdapter {
    String get(String url);

    void post(String url, String data);
}
