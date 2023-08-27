package ex13_ChatGPT.JavaTesting.EntryLevel1.personFactory;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateCalendarExample {
    public static void main(String[] args) {
        int year = 2023;
        int month = 8; // 8월

        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        int daysInMonth = firstDayOfMonth.lengthOfMonth(); // 31
        int dayOfWeek = firstDayOfMonth.getDayOfWeek().getValue(); // 2은 월요일

        DayOfWeek dayOfWeek1 = firstDayOfMonth.getDayOfWeek(); //요일 나옴.

        System.out.println("SunMonTueWedThuFriSat");

        //이 부분은 달력 출력에서 첫 주의 시작 요일에 따라서 그 주의 시작까지 공백을 출력하는 부분입니다.
        // 이를 통해 달력의 시작 요일을 맞춰줄 수 있습니다.
        for (int i = 1; i < dayOfWeek; i++) { //dayOfWeek 2
            System.out.print("              ");
        }

        for (int day = 1; day <= daysInMonth; day++) { // 31
            //%3d: 숫자를 3자리 너비로 출력합니다. 숫자가 3자리보다 짧으면 앞에 공백을 채웁
            System.out.printf("%3d ", day);

            if (firstDayOfMonth.getDayOfWeek() == java.time.DayOfWeek.SATURDAY) {
                System.out.println();
            }

            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }// --for

        System.out.println(" ");
        System.out.println("---------");
        System.out.println(firstDayOfMonth);
        System.out.println("daysInMonth "+daysInMonth);
        System.out.println("dayOfWeek 요일 "+dayOfWeek1);
        System.out.println("dayOfWeek "+dayOfWeek);
    }
}
