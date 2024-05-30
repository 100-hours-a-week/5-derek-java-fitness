package sixweek;

import java.util.Scanner;

public class HealthMetricsDisplay {
    private final Scanner scanner;
    private Record record;

    public HealthMetricsDisplay(Scanner scanner, Record record) {
        this.scanner = scanner;
        this.record = record;
    }

    public void displayResult() {
        System.out.print("성별을 입력하세요 (male/female): ");
        String gender = scanner.next();

        if (!gender.equals("male") && !gender.equals("female")) {
            System.out.println("올바른 성별을 입력하세요 (male 또는 female).");
            return;
        }

        System.out.print("키(cm)를 입력하세요: ");
        double height = scanner.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        double weight = scanner.nextDouble();

        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();

        HealthMetrics metrics = new HealthMetrics(height, weight, age, gender, record);
        metrics.start();
    }
}