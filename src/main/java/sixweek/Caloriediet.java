package sixweek;

public class Caloriediet {
    private double calories;

    public Caloriediet(double calories) {
        this.calories = calories;
    }

    public String Suggestion(String timeOfDay) {
        System.out.println("****************하루 권장 칼로리 식단***************");

        if (this.calories >= 3000) {
            if (timeOfDay.equals("아침")) {
                return "아침 식단 (3000칼로리 이상)\n\n• 블루베리 팬케이크 (400칼로리)\n• 베이컨 슬라이스 (150칼로리)\n• 오렌지 주스 (200칼로리)\n";
            } else if (timeOfDay.equals("점심")) {
                return "점심 식단 (3000칼로리 이상)\n\n• 비프 버거 (600칼로리)\n• 감자튀김 (300칼로리)\n• 콜라 (150칼로리)\n";
            } else if (timeOfDay.equals("저녁")) {
                return "저녁 식단 (3000칼로리 이상)\n\n• 스테이크 (700칼로리)\n• 구운 야채 (200칼로리)\n• 레드 와인 (150칼로리)\n";
            } else {
                return "전체 식단 (3000칼로리 이상)\n\n• 아침: 블루베리 팬케이크, 베이컨 슬라이스, 오렌지 주스\n• 점심: 비프 버거, 감자튀김, 콜라\n• 저녁: 스테이크, 구운 야채, 레드 와인\n";
            }
        } else if (this.calories >= 2500) {
            if (timeOfDay.equals("아침")) {
                return "아침 식단 (2500-2999칼로리)\n\n• 시리얼 (300칼로리)\n• 우유 (150칼로리)\n• 사과 (100칼로리)\n";
            } else if (timeOfDay.equals("점심")) {
                return "점심 식단 (2500-2999칼로리)\n\n• 치킨 샐러드 (400칼로리)\n• 통밀 빵 (200칼로리)\n• 주스 (100칼로리)\n";
            } else if (timeOfDay.equals("저녁")) {
                return "저녁 식단 (2500-2999칼로리)\n\n• 연어 구이 (500칼로리)\n• 밥 (200칼로리)\n• 샐러드 (100칼로리)\n";
            } else {
                return "전체 식단 (2500-2999칼로리)\n\n• 아침: 시리얼, 우유, 사과\n• 점심: 치킨 샐러드, 통밀 빵, 주스\n• 저녁: 연어 구이, 밥, 샐러드\n";
            }
        } else if (this.calories >= 2000) {
            if (timeOfDay.equals("아침")) {
                return "아침 식단 (2000-2499칼로리)\n\n• 토스트 (200칼로리)\n• 스크램블 에그 (150칼로리)\n• 바나나 (100칼로리)\n";
            } else if (timeOfDay.equals("점심")) {
                return "점심 식단 (2000-2499칼로리)\n\n• 터키 샌드위치 (300칼로리)\n• 스프 (200칼로리)\n• 물 (0칼로리)\n";
            } else if (timeOfDay.equals("저녁")) {
                return "저녁 식단 (2000-2499칼로리)\n\n• 치킨 구이 (400칼로리)\n• 퀴노아 (200칼로리)\n• 채소 (100칼로리)\n";
            } else {
                return "전체 식단 (2000-2499칼로리)\n\n• 아침: 토스트, 스크램블 에그, 바나나\n• 점심: 터키 샌드위치, 스프, 물\n• 저녁: 치킨 구이, 퀴노아, 채소\n";
            }
        } else if (this.calories >= 1500) {
            if (timeOfDay.equals("아침")) {
                return "아침 식단 (1500-1999칼로리)\n\n• 요거트 (150칼로리)\n• 그래놀라 (100칼로리)\n• 블루베리 (50칼로리)\n";
            } else if (timeOfDay.equals("점심")) {
                return "점심 식단 (1500-1999칼로리)\n\n• 그릴드 치킨 랩 (300칼로리)\n• 샐러드 (100칼로리)\n• 물 (0칼로리)\n";
            } else if (timeOfDay.equals("저녁")) {
                return "저녁 식단 (1500-1999칼로리)\n\n• 구운 생선 (300칼로리)\n• 감자 (150칼로리)\n• 채소 (100칼로리)\n";
            } else {
                return "전체 식단 (1500-1999칼로리)\n\n• 아침: 요거트, 그래놀라, 블루베리\n• 점심: 그릴드 치킨 랩, 샐러드, 물\n• 저녁: 구운 생선, 감자, 채소\n";
            }
        } else {
            if (timeOfDay.equals("아침")) {
                return "아침 식단 (1500칼로리 이하)\n\n• 오트밀 (100칼로리)\n• 딸기 (50칼로리)\n• 차 (0칼로리)\n";
            } else if (timeOfDay.equals("점심")) {
                return "점심 식단 (1500칼로리 이하)\n\n• 야채 샐러드 (200칼로리)\n• 닭 가슴살 (100칼로리)\n• 물 (0칼로리)\n";
            } else if (timeOfDay.equals("저녁")) {
                return "저녁 식단 (1500칼로리 이하)\n\n• 두부 스테이크 (200칼로리)\n• 쌀국수 (150칼로리)\n• 채소 (50칼로리)\n";
            } else {
                return "전체 식단 (1500칼로리 이하)\n\n• 아침: 오트밀, 딸기, 차\n• 점심: 야채 샐러드, 닭 가슴살, 물\n• 저녁: 두부 스테이크, 쌀국수, 채소\n";
            }
        }
    }
}