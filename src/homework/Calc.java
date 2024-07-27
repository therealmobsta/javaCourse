package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Вывести на экран: Введите первое число
        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble(); // 2. Получить первое число

        // 3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
        System.out.print("Введите знак операции (+, -, *, /): ");
        String operation = scanner.next(); // 4. Получить знак операции

        // 4. Вывести на экран: Введите второе число
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble(); // 5. Получить второе число

        // 6. В зависимости от знака операции произвести соответствующую операцию
        double result;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.println("Результат: " + result);
        } else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.println("Результат: " + result);
        } else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.println("Результат: " + result);
        } else if (operation.equals("/")) {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Ошибка: деление на ноль!");
            }
        } else {
            System.out.println("Ошибка: недопустимый знак операции!");
        }

        scanner.close(); // Закрытие сканера
    }
}