package sixweek;

public class HealthMetrics {
    private double height;
    private double weight;
    private int age;
    private String gender;

    public HealthMetrics(double height, double weight, int age, String gender) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public double calculateBMI() {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public double calculateBMR() {
        if (gender.equals("male")) {
            return 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            return 10 * weight + 6.25 * height - 5 * age - 161;
        }
    }

    public double calculateBodyFatPercentage() {
        double bmi = calculateBMI();
        int genderFactor = gender.equals("male") ? 1 : 0;
        return (1.20 * bmi) + (0.23 * age) - (10.8 * genderFactor) - 5.4;
    }

    public double calculateMuscleMass() {
        double bodyFatPercentage = calculateBodyFatPercentage();
        return (weight * 0.45) - (bodyFatPercentage * weight / 100);
    }

    public double calculateBodyWater() {
        double muscleMass = calculateMuscleMass();
        return muscleMass * 0.75;
    }
}