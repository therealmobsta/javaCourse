package homework;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Необходимо написать калькулятор. Алгоритм:
        //1. Вывести на экран: Введите первое число
        System.out.println("Введите первое число: " );
        double firstNumber = scanner.nextDouble();

        //2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
        //3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
        System.out.println("Введите знак операции (+, -, *, /):");
        String calculation = scanner.next();
        //4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
        //4. Вывести на экран: Введите второе число
        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        //5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
        //6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
        double result;
                switch (calculation) {
                    case "+":
                        result = firstNumber + secondNumber;
                        System.out.println("Результат:" + result);
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        System.out.println("Результат" + result);
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                            System.out.println("Результат" + result);
                            break;
                    case "/":
                            if (secondNumber !=0) {
                                result = firstNumber / secondNumber;
                                System.out.println("Результат" + result);
                            } else {
                                System.out.println("Ошибка. Деление на ноль!");
                            }
                            break;
                    default:
                        System.out.println("Ошибка, недопустимый знак операци!");
                }

        scanner.close();
    }
}