package org.javaacademy.core.Lesson9.ex3;

public class Car {
    private Engine engine = new Engine(10);
    /**
     * Влож стат класс ( можно создать без car)
     */
    public static class Engine {
        private int power;

        public Engine(int power) {
            this.power = power;
        }
    }
}
