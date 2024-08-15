package org.javaacademy.core.lesson5.car;

public class Car {
    // вес машины
    private int weight = 1000;
    // тип машины

    private final String carType;

    public Car(String carType) {
        this.carType = carType;

    }

    public Car(int weight, String carType) {
        this.weight = weight;
        this.carType = carType;
    }

    public String getCarType() {
        return carType;
    }
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", carType=' " + carType + '\'' +
                '}';
    }


    /** запуск машины
     *
     */
    public void turnButton() {
        this.runEngine();
        this.turnLights();
    }

    /**
     * запуск двигателя
     */

    public void runEngine() {
        System.out.println("Двигатель запущен");
    }
        /**
         * включение фар
         */
     public void turnLights() {
         System.out.println("Фары включены");
     }

    public int getWeight() {
        return weight;
    }
}