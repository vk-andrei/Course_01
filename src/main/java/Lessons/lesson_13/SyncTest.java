package Lessons.lesson_13;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class SyncTest {
    public static void main(String[] args) throws InterruptedException {

        //semaphoreTest();
        cdlTest();
        //cbTest();
        //lockTest();

    }

    private static void semaphoreTest() {
        ExecutorService eS = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(3);
        // сколько потоков могут работать

        for (int i = 0; i < 15; i++) {
            int k = i;
            eS.execute(() -> {
                System.out.println("Start "+ k+" "+ Thread.currentThread().getName());
                try {
                    semaphore.acquire(1);
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("End " + Thread.currentThread().getName());
                    semaphore.release();
                }
            });
        }

    }

    private static void cdlTest() throws InterruptedException {
        CountDownLatch cdl = new CountDownLatch(5);

        for (int i = 0; i < 15; i++) {
            new Thread(() -> {
                System.out.println("Start " + Thread.currentThread().getName());
                try {
                    Thread.sleep(new Random().nextInt(4000) + 2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("End " + Thread.currentThread().getName());
                    cdl.countDown();
                }
            }).start();
        }

        System.out.println("BEFORE CDL");
        cdl.await();
        System.out.println("END");

    }

    private static void cbTest() throws InterruptedException {
        CyclicBarrier cb = new CyclicBarrier(5);

        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            new Thread(() -> {
                try {
                    System.out.println("Start " + Thread.currentThread().getName());
                    Thread.sleep(new Random().nextInt(4000) + 1000);

                    cb.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("End " + Thread.currentThread().getName());
                }
            }).start();
        }
    }

    private static void lockTest() {

        ReentrantLock reentrantLock = new ReentrantLock();

        new Thread(() -> {
            reentrantLock.lock();
            try {
                System.out.println("Start - " + Thread.currentThread().getName());
                Thread.sleep(new Random().nextInt(1000) + 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("End - " + Thread.currentThread().getName());
                reentrantLock.unlock();
            }
        }).start();

        new Thread(() -> {
            reentrantLock.lock();
            try {
                System.out.println("Start - " + Thread.currentThread().getName());
                Thread.sleep(new Random().nextInt(1000) + 5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("End - " + Thread.currentThread().getName());
                reentrantLock.unlock();
            }
        }).start();
    }

}
