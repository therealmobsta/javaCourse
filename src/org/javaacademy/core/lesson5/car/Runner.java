package org.javaacademy.core.lesson5.car;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car(1_200, "Легковая");
        Car car2 = new Car("Грузовая");
        car.turnButton();
        car.runEngine();
        System.out.println("Вес машины: " + car.getWeight() + "\nТип: " + car.getCarType());
        System.out.println("Вес машины: " + car2.getWeight());
        System.out.println(car.toString());



    }
}
