package temp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class temp_test {
    static Scanner SCAN = new Scanner(System.in);
    static int SIZE = 3;
    static char[][] map = new char[SIZE][SIZE];
    static char DOT_EMPTY = '•';
    static char DOT_HUMAN = 'X';
    public static final String HEADER_FIRST_SYMBOL = "#";
    public static final String SPACE_MAP = " ";

    //public static Pattern compile(String literal)
    //public static Pattern compile(String literal, int flags)

// \d \s \d

    public static void main(String[] args) {
        initMap();
        humanTurn();
        printMap();


    }
    private static void humanTurn() {
        String str = "";
        int x, y;

        String regex = "\\d{1,2}\\s\\d{1,2}";
        Pattern myPattern = Pattern.compile(regex);
        boolean b = false;
        do {
            do {
                System.out.print("Input row & column (throw 1 space): ");
                str = SCAN.nextLine();
                Matcher myMatcher = myPattern.matcher(str);
                b = myMatcher.matches();
            } while (!b);

            String[] strArr = str.split(" ");
            x = Integer.parseInt(strArr[0]) - 1;
            y = Integer.parseInt(strArr[1]) - 1;
        } while (!isValidCell(x, y));
        map[x][y] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && y >= 0 && x < SIZE && y < SIZE && map[y][x] == DOT_EMPTY;
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {  // print row's or column's number
        System.out.print((i + 1) + " ");
    }
}
