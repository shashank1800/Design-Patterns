package org.example.a_creational_patterns.c_singleton;

public class Client {
    public static void main(String[] args) {
        Database database = Database.getInstance();

        database.query();
    }
}
