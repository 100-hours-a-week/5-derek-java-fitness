package sixweek;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        boolean continueRunning = true;
        WordArt wordArt = new WordArt();
        wordArt.MenuBanner();
        while (continueRunning) {
            System.out.println("❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚메뉴를 선택하세요:❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚❚█══█❚");
            System.out.println("                                                  1. Inbody 생성기");
            System.out.println("                                                  2. 사용자 하루 칼로리 섭취 권장량");
            System.out.println("                                                  3. 칼로리 식단");
            System.out.println("                                                  4. 음식 단백질 함량 계산기");
            System.out.println("                                                  0. 프로그램 종료");
            System.out.print("                                                  선택: ");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
                continue;
            }
            CaloriedietDisplay displayCaloriediet = new CaloriedietDisplay(scanner);
            switch (choice) {
                case 1:
                    HealthMetricsDisplay displayHealth = new HealthMetricsDisplay(scanner);
                    displayHealth.displayResults();
                    System.out.println("계속 하시겠습니까? (yes/no)");
                    String answer = scanner.next();
                    if(!answer.equalsIgnoreCase("yes")){
                        continueRunning = false;
                        System.out.println("프로그램을 종료합니다");
                    }
                    break;
                case 2:
                    CalorieMetricsDisplay displayCalorie = new CalorieMetricsDisplay(scanner);
                    displayCalorie.displayResult();
                    System.out.println("칼로리를 통해 하루 칼로리기반 권장 식단을 알고 싶나요? (yes/no)");
                    String response = scanner.next();
                    if(response.equalsIgnoreCase("yes")){
                        displayCaloriediet.displayResult();
                    }
                    break;
                case 3:
                    displayCaloriediet.displayResult();
                    break;
                case 4:
                    FoodCallListDisplay displayFoodCallList = new FoodCallListDisplay(scanner);
                    displayFoodCallList.displayResult();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }

            if (continueRunning && choice != 1){
                System.out.println("계속 하시겠습니까? (yes/no)");
                String answer = scanner.next();
                if(!answer.equalsIgnoreCase("yes")){
                    continueRunning = false;
                    System.out.println("프로그램을 종료합니다");
                }
            }
        }
    }
}