package by.epamtc.automation.fundamentals.optional;

//Ввести n чисел с консоли. Вывести на консоль те числа, длина которых
//меньше (больше) средней длины по всем числам, а также длину.

public class FundamentalsOptionalTask3 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        printNumbersLongerThanAverage(numericArray);
        printNumberShorterThanAverage(numericArray);
    }

    public static double findAverageLength(int[] array) {
        double sumLengths = 0;
        for(int i = 0; i < array.length; i++ ) {
            sumLengths += CommonMethods.findAmountOfDigitsInNumber(array[i]);
        }
        return sumLengths / array.length;
    }

    public static void printNumbersLongerThanAverage(int[] array) {
        System.out.printf("Числа, длина которых больше средней, равной %.1f цифр: \n", findAverageLength(array));
        for(int i = 0; i < array.length; i++) {
            if ((double)CommonMethods.findAmountOfDigitsInNumber(array[i]) > findAverageLength(array)) {
                System.out.printf("%d - длина равна %d\n", array[i], CommonMethods.findAmountOfDigitsInNumber(array[i]));
            }
        }
    }

    public static void printNumberShorterThanAverage(int[] array) {
        System.out.printf("Числа, длина которых меньше средней, равной %.1f цифр: \n",  findAverageLength(array));
        for(int i = 0; i < array.length; i++) {
            if ((double)CommonMethods.findAmountOfDigitsInNumber(array[i]) <  findAverageLength(array)) {
                System.out.printf("%d - длина равна %d\n", array[i], CommonMethods.findAmountOfDigitsInNumber(array[i]));
            }
        }
    }
}
