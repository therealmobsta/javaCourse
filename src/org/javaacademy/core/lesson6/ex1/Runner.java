package org.javaacademy.core.lesson6.ex1;

import org.javaacademy.core.lesson6.ex1.car.LightCar;
import org.javaacademy.core.lesson6.ex1.car.Truck;

public class Runner {
    public static void main(String[] args) {
        LightCar lightCar = new LightCar(120, 120, "Black");
        System.out.println(lightCar);
        Truck truck = new Truck(10000, 100, "White");
        System.out.println(truck);
        lightCar.printInfo();
        truck.truckInfo();

    }
}
