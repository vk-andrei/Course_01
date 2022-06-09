package Lessons.lesson_13;

import java.util.*;
import java.util.concurrent.*;


public class Main {
    public static void main(String[] args) {
        //testFixedExecutor();
        //testScheduledExecutorService();
        testCollection();
    }

    // ��� ������� �������� ���-�� �������

    private static void testFixedExecutor() {
        ExecutorService pool = Executors.newFixedThreadPool(3);
//        , r -> {
//            System.out.println("Thread is created!");
//            return new Thread(r);
//        });

        for (int i = 0; i < 20; i++) {
            int k = i;
            pool.execute(() -> System.out.println(Thread.currentThread().getName() + "-" + k));

        }
        pool.shutdown();
    }
    // ������� ������ �� ����������????

    private static void testScheduledExecutorService() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.scheduleAtFixedRate(() -> {
            System.out.println(new Date() + " --- START");
            try {
                Thread.sleep(new Random().nextInt(3000) + 4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date() + " END +++");
        }, 2, 10, TimeUnit.SECONDS);
    }

    private static void testCollection() {
        Map <String, String> hashTable = new Hashtable<>();                         // - ����������������
        Map<String,String> map = Collections.synchronizedMap(new HashMap<>());      // - ����������������
        Map<String,String> chm = new ConcurrentHashMap<>();                         // - ����������������

        StringBuilder sb = new StringBuilder();
        StringBuffer sbf = new StringBuffer(); // - ����������������
    }

}