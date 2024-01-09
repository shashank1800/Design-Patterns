package org.example.b_structural_pattern.a_adapter_pattern;

public class NewLibraryAdapter implements NetworkAdapter {

    LegacyLibrary library = new LegacyLibrary();

    @Override
    public String get(String url) {
        return library.get(url);
    }

    @Override
    public void post(String url, String data) {
        library.post(url, data);
    }
}
