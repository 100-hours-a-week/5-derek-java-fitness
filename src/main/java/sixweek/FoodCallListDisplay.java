package sixweek;
import java.util.Scanner;

public class FoodCallListDisplay {
    private final Scanner scanner;
    private final String[] foodName = {
            "닭 가슴살", "연어", "콩류", "계란", "그릭 요거트", "쿼트 치즈", "퀴노아", "호두", "아몬드",
            "소고기", "돼지고기", "가재", "참치", "부두 체리", "템페", "강낭콩", "치킨 브레스트", "치즈", "에다마메", "터키"
    };

    public FoodCallListDisplay(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayResult() {
        System.out.println("****************하루 권장 칼로리 식단****************");
        System.out.println("아래 목록에서 원하시는 음식 번호를 선택해주세요:");

        for (int i = 0; i < foodName.length; i++) {
            System.out.printf("%d. %s\n", i + 1, foodName[i]);
        }

        System.out.print("음식 번호를 입력하세요: ");
        int selection = scanner.nextInt();
        int grams = 0;
        FoodCalList foodcallList = new FoodCalList(selection,grams);

        if (selection < 1 || selection > foodName.length) {
            System.out.println("잘못된 입력입니다. 올바른 번호를 입력해주세요.");
        } else {
            System.out.printf("선택하신 음식: %s\n", foodName[selection - 1]);
            System.out.println("선택하신 음식의 그램 수를 입력하세요:");
            grams = scanner.nextInt();
            System.out.printf("%d그램의 %s는 대략 %.2f그램의 단백질을 포함하고 있습니다.\n",
                    grams, foodName[selection - 1], foodcallList.calculateProtein(selection,grams));
        }
    }
}