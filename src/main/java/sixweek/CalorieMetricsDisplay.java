package sixweek;

import java.util.Scanner;

public class CalorieMetricsDisplay {
    private final Scanner scanner;

    public CalorieMetricsDisplay(Scanner scanner){
        this.scanner = scanner;
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

        CalorieMetrics metrics = new CalorieMetrics(height, weight, age, gender);
        double bmr = metrics.calculateBMR();
        System.out.printf("기초 대사량(BMR): %.2f 칼로리\n", bmr);

        System.out.println("활동 수준을 선택하세요:");
        System.out.println("1. 비활동적 (BMR × 1.2)");
        System.out.println("2. 약간 활동적 (BMR × 1.375)");
        System.out.println("3. 적당히 활동적 (BMR × 1.55)");
        System.out.println("4. 매우 활동적 (BMR × 1.725)");
        System.out.println("5. 극도로 활동적 (BMR × 1.9)");
        int activityLevel = scanner.nextInt();

        double dailyCalories = metrics.calculateDailyCalories(bmr, activityLevel);
        System.out.printf("일일 권장 칼로리 섭취량: %.2f 칼로리\n", dailyCalories);
    }
}