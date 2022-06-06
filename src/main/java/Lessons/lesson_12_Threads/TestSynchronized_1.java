package Lessons.lesson_12_Threads;

public class TestSynchronized_1 {

    private static final int STEPS = 10000;
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        TestSynchronized_1 testSynchronized1 = new TestSynchronized_1();
        TestSynchronized_1 testSynchronized2 = new TestSynchronized_1();

        var t1 = new Thread(() -> testSynchronized1.incCounter());
        var t2 = new Thread(testSynchronized2::decCounter);

        // √ŒÕ ¿ œ–Œ÷≈——Œ¬ RACE CONDITION
        // SEE NEXT FILE

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }

    public void incCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter++;
        }
    }

    public void decCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter--;
        }
    }
}