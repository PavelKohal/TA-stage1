package by.epamtc.automation.collections.main.candies;

import by.epamtc.automation.collections.main.types.LollypopType;

public class Lollypop extends Candy {

    private String taste;
    private LollypopType lollypopType;

    public Lollypop(String name, int weight, double costPerKilogram, int caloriesPer100g,
                    int sugarPer100g, String taste, LollypopType lollypopType) {

        super(name, weight, costPerKilogram, caloriesPer100g, sugarPer100g);
        this.taste = taste;
        this.lollypopType = lollypopType;
    }

    @Override
    public String toString() {
        return super.toString() + ", вкус: " + taste +
                ", тип леденцовой конфеты: " + lollypopType;
    }
}
