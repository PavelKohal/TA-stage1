package by.epamtc.automation.fundamentals.optional;

//Ввести n чисел с консоли. Найти число, в котором количество различных
//цифр минимально. Если таких чисел несколько, найти первое из них.

public class FundamentalsOptionalTask4 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        System.out.printf("Число с наименьшим количеством уникальных цифр: %d",
                findNumberLeastAmountUniqueDigits(numericArray));
    }

    public static int findNumberLeastAmountUniqueDigits(int[] array) {
        int numberLeastAmountUniqueDigits = array[0];
        int leastAmountUniqueDigits = CommonMethods.findAmountOfUniqueDigits(array[0]);
        for(int i = 1; i < array.length; i++) {
            if(leastAmountUniqueDigits > CommonMethods.findAmountOfUniqueDigits(array[i])) {
                leastAmountUniqueDigits = CommonMethods.findAmountOfUniqueDigits(array[i]);
                numberLeastAmountUniqueDigits = array[i];
            }
        }
        return numberLeastAmountUniqueDigits;
    }
}
