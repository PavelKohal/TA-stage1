package by.epamtc.automation.collections.main.candies;

public abstract class Candy {

    private String name;
    private int weight;
    private double costPerKilogram;
    private int caloriesPer100g;
    private int sugarPer100g;

    public Candy(String name, int weight, double costPerKilogram,
                 int caloriesPer100g, int sugarPer100g) {
        this.name = name;
        this.weight = weight;
        this.costPerKilogram = costPerKilogram;
        this.caloriesPer100g = caloriesPer100g;
        this.sugarPer100g = sugarPer100g;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public double getCostPerKilogram() {
        return costPerKilogram;
    }

    public int getCaloriesPer100g() {
        return caloriesPer100g;
    }

    public int getSugarPer100g() {
        return sugarPer100g;
    }

    @Override
    public String toString() {
        return name + ", " + weight + "гр, " + costPerKilogram +
                " руб/кг, " + caloriesPer100g + " ккал";
    }
}
