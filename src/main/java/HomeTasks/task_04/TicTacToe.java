package HomeTasks.task_04;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicTacToe {

    static int size;
    static char[][] map;
    static int dots_to_win;
    static final char DOT_EMPTY = 'Х';
    static final char DOT_HUMAN = 'X';
    static final char DOT_TERMINATOR = 'O';
    static int turns_counter;
    static int lastRow;
    static int lastColomn;

    static final String HEADER_FIRST_SYMBOL = " #";

    static final Scanner SCAN = new Scanner(System.in);
    static final Random RAND = new Random();

    public static void game_TicTacToe() {

        do {
            System.out.println("THE GAME STARTS");
            initGame();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void playGame() {
        while (true) {

            humanTurn();                    // 1.
            printMap();                     // 2.
            if (checkEnd(DOT_HUMAN))        // 3.
                break;
            terminatorTurn();               // 4.
            printMap();                     // 5.
            if (checkEnd(DOT_TERMINATOR))   // 6.
                break;
        }
    }

    private static void initGame() {
        turns_counter = 0;
        size = inputFromScanner();
        SCAN.nextLine();                            // clearing Scanner's buffer
        dots_to_win = chooseDotsToWin(size);
        System.out.println("Get " + dots_to_win + " chips in a line to win.");
        map = new char[size][size];
        initMap();
    }

    private static int inputFromScanner() {
        while (true) {
            System.out.print("Enter game size (3 - 20): ");
            if (SCAN.hasNextInt()) {
                return SCAN.nextInt();
            }
            System.out.println(SCAN.next() + " - not a number!");
        }
    }

    private static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static int chooseDotsToWin(int size) {
        return switch (size) {
            case 1, 2, 3, 4, 5 -> 3;
            case 6, 7, 8, 9, 10 -> 4;
            default -> 5;
        };
    }

    private static void printMap() {
        System.out.print(HEADER_FIRST_SYMBOL);
        for (int i = 0; i < size; i++) {
            System.out.printf("%3d", (i + 1));
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.printf("%2d", (i + 1));
            for (int j = 0; j < size; j++) {
                System.out.printf("%3c", map[i][j]);
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        System.out.println("HUMAN TURN");
        String str;
        String regex = "\\d{1,2}\\s\\d{1,2}";
        Pattern myPattern = Pattern.compile(regex);         // Pattern for checking
        boolean checkPattern;
        int x, y;
        do {
            do {
                System.out.print("Input row & column (throw 1 space): ");
                str = SCAN.nextLine();
                Matcher myMatcher = myPattern.matcher(str);
                checkPattern = myMatcher.matches();
            } while (!checkPattern);

            String[] strArr = str.split(" ");
            x = Integer.parseInt(strArr[0]) - 1;
            y = Integer.parseInt(strArr[1]) - 1;
        } while (!isValidCell(x, y));

        map[x][y] = DOT_HUMAN;
        lastRow = x;
        lastColomn = y;
        turns_counter++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("HUMAN WINS!");
            } else {
                System.out.println("TERMINATOR WINS!");
            }
            return true;
        }
        if (checkDraw()) {
            System.out.println("DRAW!");
            return true;
        }
        return false;
    }

    private static void terminatorTurn() {
        int x, y;
        do {
            x = RAND.nextInt(size);
            y = RAND.nextInt(size);
        } while (!isValidCell(x, y));
        System.out.println("TERMINATOR'S TURN was: " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_TERMINATOR;
        lastRow = x;
        lastColomn = y;
        turns_counter++;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && y >= 0 && x < size && y < size && map[x][y] == DOT_EMPTY;
    }

    private static boolean checkDraw() {
        return turns_counter >= size * size;
    }

    private static boolean checkWin(char symbol) {
        return checkWinH(symbol) || checkWinV(symbol) || checkWinD1(symbol) || checkWinD2(symbol);
    }

    private static boolean checkWinH(char symbol) {
        int counter = 0;
        for (char s : map[lastRow]) {
            if (s == symbol) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == dots_to_win) return true;
        }
        return false;
    }

    private static boolean checkWinV(char symbol) {
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (map[i][lastColomn] == symbol) {
                counter++;
            } else {
                counter = 0;
            }
            if (counter == dots_to_win) return true;
        }
        return false;
    }

    private static boolean checkWinD1(char symbol) {
        int counter = 0;
        int startRowDiag1;
        int startColomnDiag1;

        if (lastRow <= lastColomn) {                   // провер€ем в верх правой части пол€ и ровно ƒ»ј√ќЌјЋ№ 1
            startRowDiag1 = 0;
            startColomnDiag1 = lastColomn - lastRow;
            for (int j = startColomnDiag1; j < size; j++) {
                if (map[startRowDiag1++][j] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dots_to_win) return true;
            }
        } else {                                       // провер€ем в ниж левой части пол€ (lastRow > lastColomn)
            startRowDiag1 = lastRow - lastColomn;
            int j = 0;
            for (int i = startRowDiag1; i < size; i++) {
                if (map[i][j++] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dots_to_win) return true;
            }
        }
        return false;
    }

    private static boolean checkWinD2(char symbol) {
        int counter = 0;
        int startRowDiag2;
        int sumCell = lastColomn + lastRow;
        int startColDiag2;

        if (sumCell < size) {                 // провер€ем в верх левой части пол€ и ƒ»ј√ќЌјЋ№ 2
            startRowDiag2 = sumCell;
            startColDiag2 = 0;
            for (int i = startRowDiag2; i >= 0; i--) {
                if (map[i][startColDiag2++] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dots_to_win) return true;
            }
        } else {                          // провер€ем нижнюю правую часть диагонали  ((sumCell >= size))
            startRowDiag2 = size - 1;
            startColDiag2 = sumCell - size + 1;
            for (int j = startColDiag2; j < size - 1; j++) {
                if (map[startRowDiag2--][j] == symbol) {
                    counter++;
                } else {
                    counter = 0;
                }
                if (counter == dots_to_win) return true;
            }
        }
        return false;
    }

    private static boolean isContinueGame() {
        System.out.println("Do you want to play one more time? (y/n): ");
        return switch (SCAN.next()) {
            case "y", "yes", "да", "1" -> true;
            default -> false;
        };
    }

    private static void endGame() {
        System.out.println("GAME OVER!");
        System.out.println("I hope to see you soon...");
        SCAN.close();
    }
}