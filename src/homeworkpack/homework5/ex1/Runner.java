package homeworkpack.homework5.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

    private static void ex1() {
        // Донаты со всего мира
        // Одному блогеру присылают пожертвования(донаты) за его ролики
        // Данные о пожертвованиях содержатся в файле donation.csv (папка src)
        // Необходимо посчитать сумму пожертвований от пользователей из каждой страны
        // Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу) и подписать и вывести

        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};
        String filename = "src/donation.csv";

        Map<String, Double> donations = new HashMap<>();

        // Инициализация начальных значений для каждой страны
        for (String country : countries) {
            donations.put(country, 0.0);
        }

        try (Scanner scanner = new Scanner(new File(filename))) {
            // Пропуск заголовка
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            // Чтение и обработка строк файла
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");

                if (parts.length == 2) {
                    String country = parts[0];
                    String donationStr = parts[1];

                    try {
                        double donation = Double.parseDouble(donationStr.replace(",", "."));
                        if (donations.containsKey(country)) {
                            donations.put(country, donations.get(country) + donation);
                        }
                    } catch (NumberFormatException e) {
                        // Пропуск строки с некорректной суммой и вывод сообщения об ошибке
                        System.out.println("Некорректная сумма в строке: " + line);
                    }
                } else {
                    // Пропуск строки с некорректным форматом и вывод сообщения об ошибке
                    System.out.println("Некорректный формат строки: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + filename);
        }

        // Вывод результатов
        for (String country : countries) {
            System.out.printf("%s - %.2f%n", country, donations.get(country));
        }
    }

    public static void main(String[] args) {
        ex1();
    }
}