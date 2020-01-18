package by.epamtc.automation.collections.main;

import by.epamtc.automation.collections.main.candies.Candy;
import java.util.Comparator;

public class CalorieComparator implements Comparator<Candy> {

    @Override
    public int compare(Candy candy1, Candy candy2) {
        if (candy1.getCaloriesPer100g() == candy2.getCaloriesPer100g()) {
            return 0;
        }
        else if (candy1.getCaloriesPer100g() > candy2.getCaloriesPer100g()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
