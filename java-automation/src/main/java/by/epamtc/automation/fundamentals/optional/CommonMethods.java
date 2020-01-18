package by.epamtc.automation.fundamentals.optional;

//Часто повторяющиеся статические методы

import java.util.Scanner;

public class CommonMethods {

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

    public static int findAmountOfDigitsInNumber(int number) {
        int digitCounter;
        if(number == 0) {
            digitCounter = 1;
        } else {
            digitCounter = 0;
        }
        while (number != 0) {
            digitCounter++;
            number /= 10;
        }
        return digitCounter;
    }

    public static int[] convertNumberToArrayOfDigits(int number) {
        int[] arrayDigits;
        int digitCounter = findAmountOfDigitsInNumber(number);
        if(digitCounter == 1) {
            arrayDigits = new int[]{number};
        } else {
            arrayDigits = new int[digitCounter];
            for (int i = digitCounter - 1; i >= 0; i--) {
                arrayDigits[i] = number % 10;
                number /= 10;
            }
        }
        return arrayDigits;
    }

    static int findAmountOfUniqueDigits(int number) {
        int[] arrayDigits = convertNumberToArrayOfDigits(number);
        int totalAmountOfDigits = 0;
        int totalAmountOfRepetitions = 0;

        for (int i = 0; i < arrayDigits.length; i++) {
            totalAmountOfDigits++;
            for (int j = i + 1; j < arrayDigits.length; j++)
            {
                if (arrayDigits[j] == arrayDigits[i])
                {
                    totalAmountOfRepetitions++;
                    break;
                }
            }
        }
        return totalAmountOfDigits - totalAmountOfRepetitions;
    }
}
