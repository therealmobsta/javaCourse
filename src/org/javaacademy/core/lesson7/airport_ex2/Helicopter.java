package org.javaacademy.core.lesson7.airport_ex2;

public abstract class Helicopter implements Flyable {
// вертикальный взлет
    public void flyVertical() {
        System.out.println("Вертикально летит");
    }
    public void catapultPilot() {
        System.out.println("Катапультируем пилота");
    }
}
