package org.javaacademy.core.lesson6.ex1.car;

public class Car {
    protected int weight;
    protected int maxSpeed;
    protected String color;

    public Car(int weight, int maxSpeed, String color) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void go() {
        System.out.println("Машина едет");
    }

    public int getWeight() {
        return weight;
    }
    protected void getInfo() {
        System.out.println("Вес машины " + this.weight);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}

