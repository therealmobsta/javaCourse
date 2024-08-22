package org.javaacademy.core.lesson6.ex3;

public class Computer {

    public void sayHello() {
        System.out.println("Привет");
    }
    public void sayHello (String name) {
        System.out.println("Привет " + name);
    }

    @Override
    public String toString() {
        return "Это компьютер";
    }
}
