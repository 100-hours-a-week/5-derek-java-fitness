package sixweek;

public class HealthMetrics implements Runnable {
    private double height;
    private double weight;
    private int age;
    private String gender;
    private Record record;
    private Thread thread;

    public HealthMetrics(double height, double weight, int age, String gender, Record record) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.record = record;
        this.thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        double bmi = calculateBMI();
        String risk = healthRisk(bmi);
        record.addRecord("BMI: " + bmi);
        record.addRecord("Health Risk: " + risk);
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Health Risk: " + risk);
    }

    public double calculateBMI() {
        return weight / ((height / 100) * (height / 100));
    }

    public String healthRisk(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}