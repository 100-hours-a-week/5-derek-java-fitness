package sixweek;

public class CalorieMetrics implements Runnable {
    private double height;
    private double weight;
    private int age;
    private String gender;
    private Record record;
    private Thread thread;

    public CalorieMetrics(double height, double weight, int age, String gender, Record record) {
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
        double bmr = calculateBMR();
        record.addRecord("BMR: " + bmr);
        System.out.printf("BMR: %.2f\n", bmr);
    }

    public double calculateBMR() {
        return 10 * weight + 6.25 * height - 5 * age + (gender.equals("male") ? 5 : -161);
    }
}