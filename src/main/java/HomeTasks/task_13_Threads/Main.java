package HomeTasks.task_13_Threads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;

public class Main {

    public static final int CARS_QTY = 4;
    public static boolean isWinner = false;

    public static void main(String[] args) throws InterruptedException {

        Consumer<Car> callback = car -> {
            if (!isWinner) {
                System.out.println(car.getName() + " is WIN!");
            };
            isWinner = true;
        };

        System.out.println("\nATTENTION >>> PREPARING!!!\n");

        /***** add Semaphore *****/
        Semaphore smp = new Semaphore(2);

        Race race = new Race(new Road(60), new Tunnel(smp), new Road(40));
        Car[] cars = new Car[CARS_QTY];

        /***** add Barrier *****/
        CyclicBarrier cb = new CyclicBarrier(4);

        /***** add CountDownLatch *****/
        CountDownLatch cdl_afterPreparing = new CountDownLatch(4);
        CountDownLatch cdl_afterFinish = new CountDownLatch(4);

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl_afterPreparing, cdl_afterFinish, callback);
        }

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }

        cdl_afterPreparing.await();

        System.out.println("\nATTENTION >>> Race is STARTED!\n");

        cdl_afterFinish.await();

        System.out.println("\nATTENTION >>> Race is FINISHED!");
    }
}
