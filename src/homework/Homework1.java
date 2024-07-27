package homework;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        // 1. Убрать лишние пробелы
        name = name.trim();
        // 2. Перевод в верхний регистр
        name = name.toUpperCase();
        // 3. Наличие "Ова" или "Ов'
        if (name.contains("ОВА ")) {
            System.out.println("Уважаемая " + name);
        } else if (name.contains("ОВ ")) {
            System.out.println("Уважаемый " + name);
        } else {
            System.out.println("Неизвестное лицо " + name);
        }

    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;
        // Проверка, можно ли запустить машину
        if (fuel >= 10
                && isEngineWork
                && isWheelWork1
                && isWheelWork2
                && isWheelWork3
                && isWheelWork4
                && !hasErrors) {

            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        String simply = "this is simply. This is my favorite song.";
        //1. Замена в строке this is - those are
        simply = simply.replace("this is", "those are");
        System.out.println(simply);
    }
}

