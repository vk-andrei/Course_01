package HomeTasks.task_01;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("-----------------------------------");
        checkSumSign();
        System.out.println("-----------------------------------");
        printColor();
        System.out.println("-----------------------------------");
        compareNumbers();
        System.out.println("-----------------------------------");
        checkLeapYear(2022);   // Задание из методички. Високосный год
    }

    private static void compareNumbers() {
        double a = -100 + Math.random() * 201;
        double b = -100 + Math.random() * 201;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println((a >= b) ? "a >= b" : "a < b");
    }

    private static void printColor() {
        int value = -200 + (int) (Math.random() * 401); // [-200..200]
        if (value <= 0) {
            System.out.println("Red! (" + value + ")");
        } else if (value < 100) {
            System.out.println("Yellow! (" + value + ")");
        } else {
            System.out.println("Green! (" + value + ")");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    private static void checkSumSign() {
        float a = 20.2f;
        double b = 19.8;
        String result = ((a + b) > 0) ? "Summ is positive" : "Summ is negative";
        System.out.println(result);
    }

    public static void checkLeapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("This year is LEAP");
        } else {
            System.out.println("This year is COMMON");
        }
    }
}