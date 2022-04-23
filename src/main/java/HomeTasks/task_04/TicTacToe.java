package HomeTasks.task_04;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    public static final int SIZE = 3;
    public static char[][] map;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final Scanner SCAN = new Scanner(System.in);
    public static final Random RAND = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Human WINS!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }
            terminatorTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Terminator WINS!");
                break;
            }
            if (isMapFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        String str = "";
        int x, y;
        do {
            System.out.print("Input X & Y (throw space): ");
            str = SCAN.nextLine();
            String[] strArr = str.split(" ");
            x = Integer.parseInt(strArr[0]) - 1;
            y = Integer.parseInt(strArr[1]) - 1;
        } while (!isValidCell(x, y));
        map[y][x] = DOT_X;
    }

    private static void terminatorTurn() {
        int x, y;
        do {
            x = RAND.nextInt(SIZE);
            y = RAND.nextInt(SIZE);
        } while (!isValidCell(x, y));
        System.out.println("Terminator's turn was: " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && y >= 0 && x < SIZE && y < SIZE && map[y][x] == DOT_EMPTY;
    }

    private static boolean isMapFull() {
        for (char[] arrX : map) {
            for (char symbol : arrX) {
                if (symbol == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        int winX = 0;
        int winY = 0;
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    winX++;
                }
                if (map[j][i] == symbol) {
                    winY++;
                }
                if (i == j && map[i][j] == symbol) {
                    diag1++;
                }
                if (i + j == map.length - 1 && map[i][j] == symbol) {
                    diag2++;
                }
            }
            if (winX == DOTS_TO_WIN || winY == DOTS_TO_WIN || diag1 == DOTS_TO_WIN || diag2 == DOTS_TO_WIN) return true;
            winX = 0;
            winY = 0;
        }
        return false;
    }
}
