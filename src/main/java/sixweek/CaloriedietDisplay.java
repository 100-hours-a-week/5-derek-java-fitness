package sixweek;

import java.util.Scanner;

public class CaloriedietDisplay {
    private final Scanner scanner;
    private final CurrentTimeThread timeThread;

    public CaloriedietDisplay(Scanner scanner, CurrentTimeThread timeThread) {
        this.scanner = scanner;
        this.timeThread = timeThread;
    }

    public void displayResult() {
        try {
            // 현재 시간 가져오기
            String currentTime = timeThread.getCurrentTime();
            int currentHour = Integer.parseInt(currentTime.split(":")[0]);

            String timeOfDay;
            if (currentHour >= 5 && currentHour < 11) {
                timeOfDay = "아침";
            } else if (currentHour >= 11 &&

                    currentHour < 17) {
                timeOfDay = "점심";
            } else if (currentHour >= 17 && currentHour < 21) {
                timeOfDay = "저녁";
            } else {
                timeOfDay = "야식";
            }

            System.out.println("지금 시간은 " + currentTime + " 입니다.");
            System.out.println(timeOfDay + " 식단을 보여드릴까요 아니면 전체 하루 식단을 보여드릴까요?");
            System.out.println("1. " + timeOfDay + " 식단");
            System.out.println("2. 전체 식단");

            int choice = scanner.nextInt();

            System.out.println("하루 권장 칼로리를 입력해주세요: ");
            System.out.println("**하루 권장 칼로리를 모르면 -1 을 입력해 하루 권장 칼로리 검색하기");
            double calories = scanner.nextDouble();

            Caloriediet diet = new Caloriediet(calories);

            if (calories < 0) {
                CalorieMetricsDisplay displayCalorie = new CalorieMetricsDisplay(scanner, new Record());
                displayCalorie.displayResult();
            } else {
                if (choice == 1) {
                    System.out.println(diet.Suggestion(timeOfDay));
                } else {
                    System.out.println(diet.Suggestion("전체"));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}