package sixweek;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시간 표시 스레드 시작
        CurrentTimeThread timeThread = new CurrentTimeThread();
        timeThread.start();

        // Record 객체 생성 (공유 자원)
        Record sharedRecord = new Record();

        // 메뉴 배너 출력
        WordArt wordArt = new WordArt();
        wordArt.MenuBanner();

        while (true) {
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. Inbody 생성기");
            System.out.println("2. 사용자 하루 칼로리 섭취 권장량");
            System.out.println("3. 칼로리 식단");
            System.out.println("4. 음식 단백질 함량 계산기");
            System.out.println("0. 프로그램 종료");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (choice) {
                case 1:
                    // Inbody 생성기 기능 호출
                    HealthMetricsDisplay healthMetricsDisplay = new HealthMetricsDisplay(scanner, sharedRecord);
                    healthMetricsDisplay.displayResult();
                    break;
                case 2:
                    // CalorieMetricsDisplay 호출
                    CalorieMetricsDisplay calorieMetricsDisplay = new CalorieMetricsDisplay(scanner, sharedRecord);
                    calorieMetricsDisplay.displayResult();
                    break;
                case 3:
                    // CaloriedietDisplay 호출
                    CaloriedietDisplay caloriedietDisplay = new CaloriedietDisplay(scanner, timeThread);
                    caloriedietDisplay.displayResult();
                    break;
                case 4:
                    // FoodCallListDisplay 호출
                    FoodCallListDisplay foodCallListDisplay = new FoodCallListDisplay(scanner, sharedRecord);
                    foodCallListDisplay.displayResult();
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}