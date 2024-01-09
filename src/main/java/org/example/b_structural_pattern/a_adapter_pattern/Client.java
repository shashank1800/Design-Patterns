package org.example.b_structural_pattern.a_adapter_pattern;

import org.example.util.CommonUtils;

public class Client {

    public static NetworkAdapter client = new NewLibraryAdapter();

    public static LegacyLibrary oldClient = new LegacyLibrary();

    public static void main(String[] args) {
        String users = client.get("/chc/users");
        CommonUtils.display(users);

        client.post("/chc/user", "Shashank");
    }
}
