package by.epamtc.automation.collections.main;

import by.epamtc.automation.collections.main.candies.Candy;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CandyLogic {

    public double getFullWeightOfGift(List<Candy> candy) {

        double giftWeight = 0;
        for(Candy c: candy) {
            giftWeight += c.getWeight();
        }
        return giftWeight;
    }

    public List <Candy> sortByCalories(List<Candy> candy) {

        CalorieComparator calorieComparator = new CalorieComparator();
        candy.sort(calorieComparator);
        return candy;
    }

    public List <Candy> findCandiesGivenPersentageSugar(List<Candy> candy, int minValue, int maxValue) {
        List<Candy> listCandiesGivenPersentageSugar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        if(minValue > maxValue) {
            int temp = maxValue;
            maxValue = minValue;
            minValue = maxValue;
        }
        for(Candy c: candy) {
            if(c.getSugarPer100g() >= minValue && c.getSugarPer100g() <= maxValue) {
                listCandiesGivenPersentageSugar.add(c);
            }
        }
        return listCandiesGivenPersentageSugar;
    }
}
