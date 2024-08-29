package org.javaacademy.core.lesson7.airport_ex2;

public interface Flyable {
    int count = 10; // static final

    void fly();

    default void land() {
        System.out.println("Летающий обьект приземлился");
    }
}
