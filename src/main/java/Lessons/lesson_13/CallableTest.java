package Lessons.lesson_13;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {4, 6, 8, 9, 2, 4, 11, 35, 21};

        ExecutorService eS1 = Executors.newSingleThreadExecutor();
        ExecutorService eS2 = Executors.newSingleThreadExecutor();

        // Создадим переменную кот хранит интерфейс Callable:
        System.out.println("Control point 1");
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int resultSum = 0;
                for (int n : arr1) {
                    resultSum += n;
                    System.out.println("t1 : " + n);
                }
                return resultSum;
            }
        };

        Future<Integer> f1 = eS1.submit(callable);
        System.out.println("Control point 2");

        Future<?> f2 = eS2.submit(() -> {
            int resultSum = 0;
            for (int n : arr2) {
                resultSum += n;
                System.out.println("t2 : " + n);
            }
            return resultSum;
        });


        System.out.println("Control point 3");
        System.out.println("Sum of arrays: " + f1.get() + " and " + f2.get());
    }
}
