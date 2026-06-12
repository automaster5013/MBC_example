package d2.p52;

import java.util.Calendar;

public class LongExample {
    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    } // 세미콜론(;)은 생략 가능합니다.

    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int iWeek = cal.get(Calendar.DAY_OF_WEEK);

        switch (iWeek) {
            case 1:
                today = Week.SUNDAY; // week -> Week로 수정
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY; // WENDESDAY -> WEDNESDAY로 철자 수정
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

        System.out.println("오늘 요일 : " + today);

        if (today == Week.SUNDAY) {
            System.out.println("오늘은 쉬는 날 입니다.");
        } else {
            System.out.println("오늘은 공부하는 날 입니다.");
        }
    }
}