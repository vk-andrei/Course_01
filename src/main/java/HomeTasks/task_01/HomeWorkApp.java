package HomeTasks.task_01;

public class HomeWorkApp {
    public static void main(String[] args) {

        printThreeWords();
        System.out.println("-----------------------------------");
        checkSumSign();

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



}
