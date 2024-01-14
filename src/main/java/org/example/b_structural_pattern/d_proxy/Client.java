package org.example.b_structural_pattern.d_proxy;

public class Client {
    public static void main(String[] args) {
        ServiceInterface service = new ProxyService(new DatabaseService());
        service.operation();
    }
}
