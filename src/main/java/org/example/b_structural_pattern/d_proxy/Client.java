package org.example.b_structural_pattern.d_proxy;

public class Client {

    private static final DatabaseService db = new DatabaseService();

    public static void main(String[] args) {
        ServiceInterface service = new ProxyService(db);
        service.operation();
    }
}
