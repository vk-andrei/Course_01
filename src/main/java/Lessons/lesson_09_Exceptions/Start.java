package Lessons.lesson_09_Exceptions;

public class Start {
    public static void main(String[] args) {

        //testException(0);
        //divideNum(1);
        testString("12d3");
    }

    private static void testException(int a) {
        // System.out.println(3/0);
        // RuntimeException e = new RuntimeException("Oh, fuck");
        //   throw e;
        if (a == 0) {
            throw new IllegalArgumentException("Argument cannot be 0");
        }
        System.out.println(5 / a);
    }

    private static void divideNum(int n) {
        int result;
        try {
            result = 30 / n;
            throw new RuntimeException("All is alright");
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
            result = -1111;
        } catch (RuntimeException e) {
            e.printStackTrace();
            result = 999999999;
        }
        System.out.println(result);
    }

    private static void testString(String s) {
        int result = 0;
        String str = s;
        try {
            result = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("this is not a number!");
        } finally {
            System.out.println(result);
        }

    }
}
