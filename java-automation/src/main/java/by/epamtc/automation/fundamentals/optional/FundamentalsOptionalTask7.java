package by.epamtc.automation.fundamentals.optional;

//Найти число, состоящее только из различных цифр.
//Если таких чисел несколько, найти первое из них.

public class FundamentalsOptionalTask7 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        findNumberConsistingOnlyVariousDigits(numericArray);
    }

    public static void findNumberConsistingOnlyVariousDigits(int[] array) {
        int numberConsistingVariousDigits = 0;
        for(int i = 0; i < array.length; i++) {
            if(CommonMethods.findAmountOfUniqueDigits(array[i]) ==
                    CommonMethods.findAmountOfDigitsInNumber(array[i])) {
                numberConsistingVariousDigits = array[i];
            }
        }
        System.out.printf("Число, состоящее только из различных цифр: %d", numberConsistingVariousDigits);
    }
}
