package Lessons.lesson_12_Threads;

public class TestSyncBlock_2 {
    private static final int STEPS = 10;
    private static final int DELAY = 500;
    private static final Object o = new Object();

    public static void main(String[] args) {
        TestSyncBlock_2 tsb1 = new TestSyncBlock_2();
        TestSyncBlock_2 tsb2 = new TestSyncBlock_2();

        // 1st way
        new Thread(tsb1::method_A, "A").start();
        // 2d way
        Thread t2 = new Thread(tsb2::method_B);
        t2.setName("B");
        t2.start();
    }

    // ЭТИ ПОТОКИ РАБОТАЮТ СИНХРОННО.
    // Смотрят на один общий объект

    private void method_A() {
        System.out.println("START method A:");

        synchronized (o) {
            for (int i = 0; i < STEPS; i++) {
                System.out.print(Thread.currentThread().getName() + ":" + i + " ");
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }

        System.out.println("END A.");
    }

    private void method_B() {
        System.out.println("START method B:");

        synchronized (o) {
            for (int i = 0; i < STEPS; i++) {
                System.out.print(Thread.currentThread().getName() + ":" + i + " ");
                try {
                    Thread.sleep(DELAY);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }

        System.out.println("END B.");
    }
}