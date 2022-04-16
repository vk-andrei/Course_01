package HomeTasks.task_02;
public class HomeWork_02 {
    public static void main(String[] args) {

        // TASK - 1
        int a = (int) (Math.random() * 21);
        int b = (int) (Math.random() * 21);
        System.out.println("a = " + a + " b = " + b);
        System.out.println("Sum [10, 20] ?: " + checksum(a , b));

        System.out.println("--------------------");
        // TASK - 2
        a = -10 + (int) (Math.random() * 21);
        System.out.println("a: " + a + " - " + checkPositive(a) + " number");

        System.out.println("--------------------");
        // TASK - 3
        a = -10 + (int) (Math.random() * 21);
        System.out.println("a: " + a + " - [negative?] - " + checkNegative(a));

        System.out.println("--------------------");
        // TASK - 4
        a = 1 + (int) (Math.random() * 5);
        String myString = "Paranoid Android";
        printString(myString, a);

        System.out.println("--------------------");
        // TASK - 5
        int year = (int) (Math.random() * 2030);
        System.out.println(year + " - " + checkLeapYear(year));

    }

    private static boolean checksum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    private static String checkPositive(int a) {
        return a >= 0 ? "positive" : "negative";
    }

    private static boolean checkNegative(int a) {
        return a < 0;
    }

    private static void printString(String myString, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(myString);
        }
    }

    private static String checkLeapYear(int year) {
        String strYear;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            strYear = "this year is LEAP";
        } else {
            strYear = "this year is COMMON";
        }
        return strYear;
    }
}
