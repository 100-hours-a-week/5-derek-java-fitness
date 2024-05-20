package sixweek;

import java.util.Scanner;

public class HealthMetricsDisplay {
    private final Scanner scanner;

    public HealthMetricsDisplay(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayResults() {
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

        HealthMetrics metrics = new HealthMetrics(height, weight, age, gender);

        System.out.printf("BMI: %.2f\n", metrics.calculateBMI());
        System.out.printf("기초 대사량(BMR): %.2f 칼로리\n", metrics.calculateBMR());
        System.out.printf("체지방률: %.2f%%\n", metrics.calculateBodyFatPercentage());
        System.out.printf("골격근량: %.2f kg\n", metrics.calculateMuscleMass());
        System.out.printf("체수분량: %.2f kg\n", metrics.calculateBodyWater());
    }
}