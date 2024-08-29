package org.javaacademy.core.lesson7.airport_ex2;

public class Runner {
    public static void main(String[] args) {
        AirPlane airplane = new AirPlane(100);
        Duck duck = new Duck(true);
        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;
        for (Flyable flyable : flyables) {
            flyable.fly();
            flyable.land();
        }
        System.out.println("___________________");
        Helicopter helicopter = new Mi20Helicopter();
        helicopter.flyVertical();
        helicopter.fly();
        System.out.println("___________________");

        Mi20Helicopter mi20Helicopter1 = new Mi20Helicopter();
        mi20Helicopter1.catapultPilot();
        Flyable flyable = new Mi20Helicopter();
        flyable.fly();
    }
}
