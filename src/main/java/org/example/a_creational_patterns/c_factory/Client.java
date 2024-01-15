package org.example.a_creational_patterns.c_factory;

public class Client {
    public static void main(String[] args) {
        Transport truck = new Truck();
        truck.deliver();

        Transport ship = new Ship();
        ship.deliver();
    }
}
