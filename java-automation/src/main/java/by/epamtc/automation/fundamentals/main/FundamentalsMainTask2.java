package by.epamtc.automation.fundamentals.main;

//Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class FundamentalsMainTask2 {

    public static void main(String[] args) {

        System.out.println("Аргументы командной строки: ");
        for(int i = 0; i < args.length; i++) {
            System.out.printf("%s ", args[i]);
        }

        System.out.println("\n\nАргументы командной строки в обратном порядке: ");
        for(int i = args.length - 1; i >= 0; i--) {
            System.out.printf("%s ", args[i]);
        }
    }
}
