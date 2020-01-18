package by.epamtc.automation.collections.main;

import by.epamtc.automation.collections.main.candies.*;
import by.epamtc.automation.collections.main.types.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandyRunner {

    public static void main(String[] args) {

        List<Candy> candy = new ArrayList<>();

        candy.add(new Lollypop("Бим-бом", 80, 5.15, 362, 88, "лимонный", LollypopType.ICE_CARAMEL));
        candy.add(new Lollypop("Чупа-чупс", 15, 21.5, 380, 92, "ежевичный", LollypopType.LOLLYPOPE_ON_STICK));
        candy.add(new Lollypop("Холлс", 25, 32.15, 385, 90, "мед и лимон", LollypopType.MONPASIER));
        candy.add(new Lollypop("Карандаш", 100, 7.20, 375, 85, "цитрусовый", LollypopType.CANDY_PENCIL));
        candy.add(new Lollypop("Коровка", 100, 7.70, 379, 91, "сливочный", LollypopType.CANDY_PENCIL));

        candy.add(new Chocolate("Арахисовые", 60, 9.99, 533, 45, 25, ChocolateType.STUFFED_CHOCOLATE));
        candy.add(new Chocolate("Kit-kat", 60, 14.99, 530, 42, 19, ChocolateType.WITH_WAFFLE));
        candy.add(new Chocolate("CandyNut", 60, 8.50, 460, 55, 22, ChocolateType.STUFFED_CHOCOLATE));
        candy.add(new Chocolate("Белорусские", 60, 12.50, 415, 45, 42, ChocolateType.PURE_CHOCOLATE));
        candy.add(new Chocolate("Choco", 60, 15.99, 436, 38, 48, ChocolateType.PURE_CHOCOLATE));

        candy.add(new Marmalade("Апельсинка", 50, 4.69, 330, 65, 20, MarmaladeType.ORANGE));
        candy.add(new Marmalade("Грушевые дольки", 75, 5.50, 342, 50, 25, MarmaladeType.PEAR));
        candy.add(new Marmalade("Boom", 50, 6.49, 345, 65, 15, MarmaladeType.ORANGE));
        candy.add(new Marmalade("Haribo", 100, 6.49, 332, 48, 20, MarmaladeType.APPLE));
        candy.add(new Marmalade("JellyBean", 75, 17.50, 352, 65, 15, MarmaladeType.LEMON));

        CandyLogic cl = new CandyLogic();

        while (true) {
            System.out.println("1. Определить итоговый вес конфет в собранном подарке.");
            System.out.println("2. Отсортировать конфеты по возрастанию калорийности.");
            System.out.println("3. Найти конфеты из подарка в заданном диапазоне содержания сахара.");
            System.out.println("0. Выход.");
            System.out.print("Введите номер требуемого действия: ");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Вес подарка: " + cl.getFullWeightOfGift(candy) + "гр.\n");
                    break;
                case 2:
                    System.out.println("Конфеты, отсортированные по калорийности: ");
                    for(Candy c: cl.sortByCalories(candy)) {
                        System.out.println(c);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Введите начало диапазона: ");
                    int minValue = sc.nextInt();
                    System.out.print("Введите конец диапазона: ");
                    int maxValue = sc.nextInt();
                    System.out.println("Конфеты с заданным содержанием сахара: ");
                    for(Candy c: cl.findCandiesGivenPersentageSugar(candy, minValue, maxValue)) {
                        System.out.println(c);
                    }
                    System.out.println();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Неверный ввод.");
            }
        }
    }
}


