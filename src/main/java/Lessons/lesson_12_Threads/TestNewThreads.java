package Lessons.lesson_12_Threads;

public class TestNewThreads {
    public static void main(String[] args) throws InterruptedException {

/*
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
        System.out.println("MAIN END");
*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                }
            }
        }, "A");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }, "B");

        // ���� true �� ������ ��� �� ���������� �.�. ���������� MAIN �����
        // t1.setDaemon(true);
        // t2.setDaemon(true);

        t1.start();
        t2.start();
        // ����� MAIN ����� ����� t1 � t2
        t1.join();
        t2.join();
    }
}

