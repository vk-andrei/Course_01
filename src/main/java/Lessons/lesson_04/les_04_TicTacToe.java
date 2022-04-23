package Lessons.lesson_04;

import java.util.Random;
import java.util.Scanner;

public class les_04_TicTacToe {
    final static int SIZE = 3;
    final static char DOT_HUMAN = 'X';
    final static char DOT_TERMINATOR = 'O';
    final static char DOT_EMPTY = '•';
    final static char[][] MAP = new char[SIZE][SIZE];
    final static Scanner in = new Scanner(System.in);
    final static Random rand = new Random();
    final static public String SPACE_MAP = " ";
    public static final String HEADER_FIRST_SYMBOL = "°";

    public static void main(String[] args) {

        init();
        printMap();

    }

    private static void init() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_MAP);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + SPACE_MAP);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }
}

// DONE IN HOMEWORK