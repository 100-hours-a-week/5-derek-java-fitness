package sixweek;

import java.util.Scanner;

public class CaloriedietDisplay {
    private final Scanner scanner;

    public CaloriedietDisplay(Scanner scanner){
        this.scanner = scanner;
    }

    public void displayResult(){
        System.out.println("하루 권장 칼로리를 입력해주세요: ");
        System.out.println("**하루 권장 칼로리를 모르면 -1 을 입력해 하루 권장 칼로리 검색하기");
        double calories = scanner.nextDouble();

        Caloriediet diet = new Caloriediet(calories);

        if (calories < 0) {
            CalorieMetricsDisplay displayCalorie = new CalorieMetricsDisplay(scanner);
            displayCalorie.displayResult();
        } else {
            diet = new Caloriediet(calories);
            System.out.println(diet.Suggestion());
        }
    }

    }

