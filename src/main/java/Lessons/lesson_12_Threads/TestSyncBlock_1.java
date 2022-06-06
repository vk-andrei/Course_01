package Lessons.lesson_12_Threads;

public class TestSyncBlock_1 {
    private static final int STEPS = 10;
    private static final int DELAY = 5000;

    public static void main(String[] args) {
        TestSyncBlock_1 tsb1 = new TestSyncBlock_1();
        TestSyncBlock_1 tsb2 = new TestSyncBlock_1();

        // 1st way
        new Thread(tsb1::method_A, "A").start();
        // 2d way
        Thread t2 = new Thread(tsb2::method_B);
        t2.setName("B");
        t2.start();

    }
    // ЭТИ ПОТОКИ РАБОТАЮТ ОДНОВРЕМЕННО (но асинхронно). Если мы хотим чтобы они работали синхронно - ждали др друга,
    // то смотри след часть

    private void method_A() {
        System.out.println("START method A:");

        for (int i = 0; i < STEPS; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + " ");
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println();
        System.out.println("END A.");
    }

    private void method_B() {
        System.out.println("START method B:");

        for (int i = 0; i < STEPS; i++) {
            System.out.print(Thread.currentThread().getName() + ":" + i + " ");
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
        System.out.println("END B.");
    }


}
