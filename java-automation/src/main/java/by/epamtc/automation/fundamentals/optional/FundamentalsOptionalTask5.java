package by.epamtc.automation.fundamentals.optional;

//Найти количество чисел, содержащих только четные цифры, а среди
//оставшихся — количество чисел с равным числом четных и нечетных цифр.

public class FundamentalsOptionalTask5 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();

        printAmountNumbersWithOnlyEvenDigits(numericArray);
        printAmountNumbersSameAmountEvenOddDigits(numericArray);
    }


    public static boolean findNumberWithOnlyEvenDigits(int number) {
        int[] arrayDigits = CommonMethods.convertNumberToArrayOfDigits(number);
        int counterEvenNumber = 0;
        for(int i = 0; i < arrayDigits.length; i++) {
            if(arrayDigits[i]  % 2 == 0) {
                counterEvenNumber++;
            }
        }
        if(counterEvenNumber == arrayDigits.length) {
            return true;
        } else {
            return  false;
        }
    }

    public static void printAmountNumbersWithOnlyEvenDigits(int[] array) {

        int counterNumbers = 0;
        for(int i = 0; i < array.length; i++) {
            if(findNumberWithOnlyEvenDigits(array[i])) {
                counterNumbers++;
            }
        }
        System.out.printf("Количество чисел с только четными цифрами: %s", counterNumbers);
    }

    public static boolean findNumberSameAmountEvenOddDigits(int number) {
        int[] arrayDigits = CommonMethods.convertNumberToArrayOfDigits(number);
        int counterEvenDigits = 0;
        int counterOddDigits = 0;
        for(int i = 0; i < arrayDigits.length; i++) {
            if(arrayDigits[i] % 2 == 0) {
                counterEvenDigits++;
            } else {
                counterOddDigits++;
            }
        }
        if(counterEvenDigits == counterOddDigits) {
            return true;
        } else {
            return  false;
        }
    }

    public static void printAmountNumbersSameAmountEvenOddDigits(int[] array) {
        int counterNumbers = 0;
        for(int i = 0; i < array.length; i++) {
            if(findNumberSameAmountEvenOddDigits(array[i])) {
                counterNumbers++;
            }
        }
        System.out.printf("\nКоличество чисел с одинаковым количеством четных и нечетных цифр: %s", counterNumbers);
    }
}
