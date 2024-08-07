package homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        // Дан массив со словами
        String[] wordsArray = {"Это", "шашлык", "на", "шампуре"};
        // Преобразуем массив в строку с разделителями
        String words = Arrays.toString(wordsArray);
        // Удаляем квадратные скобки и запятые
        words = words.substring(1, words.length() - 1).replace(", ", "-");
        System.out.println(words);
        System.out.println("______________");

// Дан массив с массивом чисел внутри
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};
        // Посчитать сумму каждой диагонали ИСПОЛЬЗУЯ цикл(ы)

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        int n = arrayOfNumbers.length;
        //Цикл для подсчета суммы диагонали
        for (int i = 0; i < n; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
        }
        for (int i = 0; i < n; i++) {
            leftDownToRightUpSum += arrayOfNumbers[i][n - 1 - i];
        }
        System.out.println("Сумма диагонали с левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);
        System.out.println("Сумма диагонали с левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);
        System.out.println("______________");
        Random random = new Random(1);
        int attempt = 1;
        int number = random.nextInt(1000);
        // Цикл для генерации случайных чисел
        while (number !=999) {
            number = random.nextInt(1000);
            attempt++;
        }
        System.out.println("Число 999 было сгенерировано на попытке номер: " + attempt);
    }
}