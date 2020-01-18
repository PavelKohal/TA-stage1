package by.epamtc.automation.fundamentals.main;

//Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

import java.util.Scanner;

public class FundamentalsMainTask3 {

    public static void main(String[] args) {

        int[] numericArray = fillArrayWithNumericalValues();
        printArrayNewline(numericArray);
        printArrayWithoutNewline(numericArray);
    }

    public static int[] fillArrayWithNumericalValues() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("Введите числа последовательности через Enter: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void printArrayWithoutNewline(int[] array) {
        System.out.println("Числа без перехода на новую строку: ");
        for(int element: array) {
            System.out.printf("%d  ", element);
        }
    }

    public static void printArrayNewline(int[] array) {
        System.out.println("Числа с переходом на новую строку: ");
        for(int element: array) {
            System.out.println(element);
        }
    }
}
