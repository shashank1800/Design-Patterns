package org.example.b_structural_pattern.a_adapter_pattern;

public class NetworkLibraryAdapter implements NetworkAdapter {

    private final LegacyLibrary library = new LegacyLibrary();


    @Override
    public String get(String url) {
        return library.getRequest(url);
    }

    @Override
    public void post(String url, String data) {
        library.postRequest(url, data);
    }
}
