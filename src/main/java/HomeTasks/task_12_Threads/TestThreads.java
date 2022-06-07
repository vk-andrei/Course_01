package HomeTasks.task_12_Threads;
import java.util.Arrays;
public class TestThreads {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public void TestArrayWithoutThreads() {
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();

        System.out.println("Delta time: " + (b - a) + " ms.");
    }

    public void TestArrayWithThreads() throws InterruptedException {
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();
        // dividing ARRAY
        float[] arr_half1 = new float[HALF];
        float[] arr_half2 = new float[HALF];
        System.arraycopy(arr, 0, arr_half1, 0, arr_half1.length);
        System.arraycopy(arr, HALF, arr_half2, 0, arr_half2.length);

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < arr_half1.length; i++) {
                arr_half1[i] = (float) (arr_half1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                        Math.cos(0.4f + i / 2));
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < arr_half2.length; i++) {
                arr_half2[i] = (float) (arr_half2[i] * Math.sin(0.2f + (i + HALF) / 5) * Math.cos(0.2f + (i + HALF) / 5) *
                        Math.cos(0.4f + (i + HALF) / 2));
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.arraycopy(arr_half1,0,arr,0,arr_half1.length);
        System.arraycopy(arr_half2,0,arr,HALF,arr_half2.length);

        long b = System.currentTimeMillis();

        /*System.out.println("arr_half1: " + Arrays.toString(arr_half1));
        System.out.println("arr_half2: " + Arrays.toString(arr_half2));
        System.out.println("arr: " + Arrays.toString(arr));*/
        System.out.println("Delta time: " + (b - a) + " ms.");
    }
}
