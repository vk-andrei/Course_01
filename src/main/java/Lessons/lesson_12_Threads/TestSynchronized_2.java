package Lessons.lesson_12_Threads;

public class TestSynchronized_2 {

    private static final int STEPS = 10000;
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        TestSynchronized_2 testSynchronized1 = new TestSynchronized_2();
        //TestSynchronized_2 testSynchronized2 = new TestSynchronized_2();

        var t1 = new Thread(testSynchronized1::incCounter);
        var t2 = new Thread(testSynchronized1::decCounter);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter);
    }

    public synchronized void incCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter++;
        }
    }

    public synchronized void decCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter--;
        }
    }
}