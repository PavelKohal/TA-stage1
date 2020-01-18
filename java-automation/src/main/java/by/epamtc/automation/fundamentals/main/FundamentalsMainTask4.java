package by.epamtc.automation.fundamentals.main;

//Ввести целые числа как аргументы командной строки, подсчитать их
//сумму (произведение) и вывести результат на консоль.

public class FundamentalsMainTask4 {

    public static void main(String[] args) {

        int[] numericArray = new int[args.length];
        for(int i = 0; i < numericArray.length; i++) {
            numericArray[i] = Integer.parseInt(args[i]);
        }
        printResults(numericArray);
    }

    public static int findSumElements(int[] array) {
        int sumElements = 0;
        for(int i = 0; i < array.length; i++) {
            sumElements += array[i];
        }
        return sumElements;
    }

    public static int findProductElements(int[] array) {
        int productElements = 1;
        for(int i = 0; i < array.length; i++) {
            productElements *= array[i];
        }
        return productElements;
    }

    public static void printResults(int[] array) {
        System.out.println("Числа - аргументы командной строки: ");
        for(int element: array) {
            System.out.printf("%d  ", element);
        }
        System.out.printf("\nСумма элементов равна %d", findSumElements(array));
        System.out.printf("\nПроизведение элементов равно %d", findProductElements(array));
    }
}
