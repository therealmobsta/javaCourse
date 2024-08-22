package org.javaacademy.core.lesson6.ex1.car;


public class Truck extends Car{
    public Truck(int weight, int maxSpeed, String color) {
        super(weight, maxSpeed, color);
    }
    public void truckInfo() {
        super.getInfo();
    }
}
