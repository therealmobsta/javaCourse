package org.javaacademy.core.lesson7.airport_ex2;

public class AirPlane implements Flyable {
    private int enginePower;

    public AirPlane(int enginePower) {
        this.enginePower = enginePower;
    }

    public void fly() {
        System.out.println("Самолет летит");
    }

    @Override
    public void land() {
        System.out.println("Самолет приземлился");

    }
}
