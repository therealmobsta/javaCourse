package org.javaacademy.core.lesson5.animal;

public class Dog {
    private String name;
    private static Dog[] dogs = new Dog[10];
    static int count = 0;
    private Dog[] childs;
//    private int countLegs; // Кол-во лап
    public final static int COUNT_LEGS = 4;

    public Dog(String name) {
        this.name = name;
        dogs[count] = this;
        count++;
    }
    public static void printDogNames() {
        for (Dog dog : dogs)
            if (dog != null) {
                System.out.println(dog.name);
            } else {
            break;
        }

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
