package sixweek;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CaloriedietDisplay {
    private final Scanner scanner;

    public CaloriedietDisplay(Scanner scanner){
        this.scanner = scanner;
    }

    public void displayResult(){
        // 현재 시간 표시
        SimpleDateFormat formatter = new SimpleDateFormat("HH");
        Date date = new Date();
        int currentHour = Integer.parseInt(formatter.format(date));

        String timeOfDay;
        if (currentHour >= 5 && currentHour < 11) {
            timeOfDay = "아침";
        } else if (currentHour >= 11 && currentHour < 17) {
            timeOfDay = "점심";
        } else if (currentHour >= 17 && currentHour < 21) {
            timeOfDay = "저녁";
        } else {
            timeOfDay = "야식";
        }

        System.out.println("지금 시간은 " + formatter.format(date) + "시 입니다.");
        System.out.println(timeOfDay + " 식단을 보여드릴까요 아니면 전체 하루 식단을 보여드릴까요?");
        System.out.println("1. " + timeOfDay + " 식단");
        System.out.println("2. 전체 식단");

        int choice = scanner.nextInt();

        System.out.println("하루 권장 칼로리를 입력해주세요: ");
        System.out.println("**하루 권장 칼로리를 모르면 -1 을 입력해 하루 권장 칼로리 검색하기");
        double calories = scanner.nextDouble();

        Caloriediet diet = new Caloriediet(calories);

        if (calories < 0) {
            CalorieMetricsDisplay displayCalorie = new CalorieMetricsDisplay(scanner);
            displayCalorie.displayResult();
        } else {
            if (choice == 1) {
                System.out.println(diet.Suggestion(timeOfDay));
            } else {
                System.out.println(diet.Suggestion("전체"));
            }
        }
    }
}