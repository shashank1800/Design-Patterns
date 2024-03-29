package org.example.a_creational_patterns.a_singleton;

import org.example.util.CommonUtils;

public class Database {
    private static Database instance = null;

    private Database(){};

    public static Database getInstance() {
        if (instance == null)
            instance = new Database();
        return instance;
    }

    void query() {
        CommonUtils.display("Database query");
    }
}
