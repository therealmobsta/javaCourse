package org.javaacademy.core.Lesson9.ex6;

public class Runner {
    public static void main(String[] args) {
        // животное - бегать (за кем бежит) орать спать
        // тигр
        // собака
        Animal tiger = new Animal() {

            @Override
            public void run(Animal animal) {
                System.out.println("Тигр бежит за: " + animal);

            }

            @Override
            public void shout() {
                System.out.println("Тигр рычит");

            }

            @Override
            public void sleep() {
                System.out.println("Тигр спит");

            }

            @Override
            public String toString() {
                return "Тигр";
            }
        };

        Animal dog = new Animal() {
            @Override
            public void run(Animal animal) {
                System.out.println("Собака бежит");
            }

            @Override
            public void shout() {
                System.out.println("Собака лает");

            }

            @Override
            public void sleep() {
                System.out.println("Собака спит");

            }

            @Override
            public String toString() {
                return "Собака";
            }
        };
        dog.run(tiger);
        tiger.run(dog);
        dog.shout();

    }
}
