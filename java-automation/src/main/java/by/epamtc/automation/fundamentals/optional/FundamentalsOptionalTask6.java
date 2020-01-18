package by.epamtc.automation.fundamentals.optional;

//Найти число, цифры в котором идут в строгом порядке возрастания.
//Если таких чисел несколько, найти первое из них.

public class FundamentalsOptionalTask6 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        findNumberWithDigitsInAscendingOrder(numericArray);
    }

    public static boolean isNumberWithDigitsInAscendingOrder(int number) {
        int[] arrayDigits = CommonMethods.convertNumberToArrayOfDigits(number);
        boolean ascendingOrderFlag = true;
        for(int i = 0; i < arrayDigits.length - 1; i++) {
            if (arrayDigits[i] >= arrayDigits[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void findNumberWithDigitsInAscendingOrder(int [] array) {
        int counterNumbers = 0;
        for(int i = 0; i < array.length - 1; i++) {
            if (isNumberWithDigitsInAscendingOrder(array[i])) {
                counterNumbers = array[i];
                break;
            }
        }
        System.out.printf("Искомое число: %d", counterNumbers);
    }
}
