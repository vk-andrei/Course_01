package Lessons.lesson_02;

import org.w3c.dom.ls.LSOutput;

public class les_02 {
    public static void main(String[] args) {

        ////////////////////////////////////////           printf
        String pattern = "1) %s \n2) %s \n3) %s";
        System.out.printf(pattern, "Orange", "Blue", "Yellow");

        //////////////////////////////////////////////////////
        int c = 0; int k = 0;
        System.out.println(3 * c++);  // постИНКРЕМЕНТ
        System.out.println(c);
        System.out.println(3 * ++k);  // деИНКРЕМЕНТ
        System.out.println(k);

        ///////////////////////////////////////

        final int SEASON_NUMBER = 3;
        final int MONTH_NUMBER = 5;
        convertSeason(SEASON_NUMBER);
        convertMonthToSeason(MONTH_NUMBER);

        ///////////////////////////////////////
        final int LIMIT_OF_CYCLE = 10;
         /*   for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
                for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                    System.out.println("i: " + i + ", j: " + j);
                }
            }*/

        String str1 = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                str1 += "X ";
            } else {
                str1 += "Y ";
            }
            System.out.print(str1);
            for (int j = 0; j <= LIMIT_OF_CYCLE - i - 1; j++) {
                System.out.print("O ");
            }
            System.out.println();
        }
    }
    //////////////////////////////////////

    private static void convertSeason(int seasonNumber) {
        String season = switch (seasonNumber) {
            case 1 -> "WINTER";
            case 2 -> "SPRING";
            case 3 -> "SUMMER";
            case 4 -> "AUTUMN";
            default -> "unknown";
        };
        System.out.println(season);
    }

    private static void convertMonthToSeason(int month_number) {
        String season = switch (month_number) {
            case 12, 1, 2 -> "WINTER";
            case 3, 4, 5 -> "SPRING";
            case 6, 7, 8 -> "SUMMER";
            case 9, 10, 11 -> "AUTUMN";
            default -> "unknown";
        };
        System.out.println(season);
    }
}
