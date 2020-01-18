package by.epamtc.automation.collections.main.candies;

import by.epamtc.automation.collections.main.types.ChocolateType;

public class Chocolate extends Candy{

    private int percentageOfCocoa;
    private ChocolateType chocolateType;

    public Chocolate(String name, int weight, double costPerKilogram, int caloriesPer100g,
                     int sugarPer100g, int percentageOfCocoa, ChocolateType chocolateType) {

        super(name, weight, costPerKilogram, caloriesPer100g, sugarPer100g);
        this.percentageOfCocoa = percentageOfCocoa;
        this.chocolateType = chocolateType;
    }

    @Override
    public String toString() {
        return super.toString() + ", содержание какао,%: " + percentageOfCocoa +
                ", тип шоколадной конфеты: " + chocolateType;
    }
}
