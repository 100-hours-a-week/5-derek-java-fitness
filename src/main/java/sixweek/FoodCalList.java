package sixweek;

public class FoodCalList {
    private int foodIndex;
    private int grams;

    public FoodCalList(int foodIndex, int grams) {
        this.foodIndex = foodIndex;
        this.grams = grams;
    }
    public double calculateProtein(int selection, int grams) {
        double[] proteinPer100g = {31.0, 20.0, 8.0, 13.0, 10.0, 11.0, 4.0, 15.0, 21.0, 26.0, 27.0, 19.0, 23.0, 0.0, 19.0, 9.0, 31.0, 38.0, 11.0, 29.0};
        return (proteinPer100g[foodIndex - 1] * grams) / 100;
    }
}
