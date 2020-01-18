package by.epamtc.automation.fundamentals.main;

/*
* Ввести число от 1 до 12. Вывести на консоль название
* месяца, соответствующего данному числу. Осуществить
* проверку корректности ввода чисел.
 */

import java.util.Scanner;

public class FundamentalsMainTask5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int monthNumber = sc.nextInt();
        String nameMonth = findNameMonth(monthNumber);
        printResults(monthNumber, nameMonth);
    }

    //метод сопоставления числового обозначения месяца и его названия
    public static String findNameMonth(int monthNumber) {
        String nameMonth;
        switch (monthNumber) {
            case 1: nameMonth = "Январь";
                break;
            case 2: nameMonth = "Февраль";
                break;
            case 3: nameMonth = "Март";
                break;
            case 4: nameMonth = "Апрель";
                break;
            case 5: nameMonth = "Май";
                break;
            case 6: nameMonth = "Июнь";
                break;
            case 7: nameMonth = "Июль";
                break;
            case 8: nameMonth = "Август";
                break;
            case 9: nameMonth = "Сентябрь";
                break;
            case 10: nameMonth = "Октябрь";
                break;
            case 11: nameMonth = "Ноябрь";
                break;
            case 12: nameMonth = "Декабрь";
                break;
            default: nameMonth = "Введено неверное числовое значение";
                break;
        }
        return  nameMonth;
    }

    //метод вывода результатов на консоль
    public static void printResults(int monthNumber, String nameMonth) {

        if(nameMonth.equals("Введено неверное числовое значение")) {
            System.out.println(nameMonth);
        } else {
            System.out.printf("Числу %d соответствует месяц %s.", monthNumber, nameMonth );
        }
    }
}
