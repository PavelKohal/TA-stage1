package by.epamtc.automation.collections.main.candies;

import by.epamtc.automation.collections.main.types.MarmaladeType;

public class Marmalade extends Candy{

    private int percentageOfFruitJuice;
    private MarmaladeType marmaladeType;

    public Marmalade(String name, int weight, double costPerKilogram, int caloriesPer100g,
                     int sugarPer100g, int percentageOfFruitJuice, MarmaladeType marmaladeType) {

        super(name, weight, costPerKilogram, caloriesPer100g, sugarPer100g);
        this.percentageOfFruitJuice = percentageOfFruitJuice;
        this.marmaladeType = marmaladeType;
    }

    @Override
    public String toString() {
        return super.toString() + ", содержание фруктового сока,%: " + percentageOfFruitJuice +
                ", тип мармеладной конфеты: " + marmaladeType;
    }
}
