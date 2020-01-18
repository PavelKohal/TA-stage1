package by.epamtc.automation.fundamentals.optional;

//Задание. Ввести n чисел с консоли. Вывести числа в
//порядке возрастания (убывания) значений их длины.

public class FundamentalsOptionalTask2 {

    public static void main(String[] args) {

        int[] numericArray = CommonMethods.fillArrayWithNumericalValues();
        sortInAscendingOrderOfLength(numericArray);
        sortInDescendingOrderOfLength(numericArray);
    }

    public static void sortInAscendingOrderOfLength(int[] array) {
        System.out.println("Числа по возрастанию их длины: ");
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(CommonMethods.findAmountOfDigitsInNumber(array[i]) >
                        CommonMethods.findAmountOfDigitsInNumber(array[i+1])) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d  ", array[i]);
        }

    }

    public static void sortInDescendingOrderOfLength(int[] array) {
        System.out.println("\nЧисла по убыванию их длины: ");
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(CommonMethods.findAmountOfDigitsInNumber(array[i]) <
                        CommonMethods.findAmountOfDigitsInNumber(array[i+1])) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d  ", array[i]);
        }
    }
}
