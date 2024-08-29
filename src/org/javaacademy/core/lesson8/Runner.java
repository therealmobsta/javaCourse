package org.javaacademy.core.lesson8;

public class Runner {
    public static void main(String[] args) {

        try {
            String myName = null;
            myName.toLowerCase();
        } catch (Exception e) {

        }

        try {
            calc(1, 0);
        } catch (Exception e) {
            System.out.println("Ошибка но мы двиг дальше");
        }
        System.out.println("След операция");
    }

    private static void calc(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
