package by.epamtc.automation.fundamentals.optional;

//Ввести n чисел с консоли. Найти самое короткое и самое
//длинное число. Вывести найденные числа и их длину.

public class FundamentalsOptionalTask1 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        printLongestAndShortestNumbers(numericArray);
    }

    //метод нахождения числа с наибольшей длиной
    public static int findTheLongestNumber(int[] array) {
        int longestNumber = array[0];
        for(int i = 1; i < array.length; i++) {
            if(CommonMethods.findAmountOfDigitsInNumber(longestNumber) < CommonMethods.findAmountOfDigitsInNumber(array[i])) {
                longestNumber = array[i];
            }
        }
        return  longestNumber;
    }

    public static int findTheShortestNumber(int[] array) {
        int shortestNumber = array[0];
        for(int i = 1; i < array.length; i++) {
            if(CommonMethods.findAmountOfDigitsInNumber(shortestNumber) > CommonMethods.findAmountOfDigitsInNumber(array[i])) {
                shortestNumber = array[i];
            }
        }
        return  shortestNumber;
    }

    public static void printLongestAndShortestNumbers(int[] array) {
        System.out.printf("Число с наибольшей длиной: %d. Его длина: %d разрядов.", findTheLongestNumber(array),
                CommonMethods.findAmountOfDigitsInNumber(findTheLongestNumber(array)));
        System.out.printf("\nЧисло с наименьшей длиной: %d. Его длина: %d разрядов.", findTheShortestNumber(array),
                CommonMethods.findAmountOfDigitsInNumber(findTheShortestNumber(array)));
    }
}
