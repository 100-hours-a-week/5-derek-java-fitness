package sixweek;

public class CalorieMetrics {
    private double height;
    private double weight;
    private int age;
    private String gender;

    public CalorieMetrics(double height, double weight, int age, String gender) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public double calculateBMR() {
        // BMR 계산 로직
        return 10 * weight + 6.25 * height - 5 * age + (gender.equals("male") ? 5 : -161);
    }

    public double calculateDailyCalories(double bmr, int activityLevel) {
        double[] activityFactors = {1.2, 1.375, 1.55, 1.725, 1.9};
        return bmr * activityFactors[activityLevel - 1];
    }
}