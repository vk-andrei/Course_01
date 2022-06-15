package Lessons.lesson_06.task_13_Threads_var2;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private CyclicBarrier cb;
    private CountDownLatch cdl_afterPreparing;
    private CountDownLatch cdl_afterFinish;
    //private Consumer<Car> callback;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed, CyclicBarrier cb, CountDownLatch cdl_afterPreparing,
               CountDownLatch cdl_afterFinish) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.cb = cb;
        this.cdl_afterPreparing = cdl_afterPreparing;
        this.cdl_afterFinish = cdl_afterFinish;
        //this.callback = callback;
        this.name = "Participant #" + CARS_COUNT;
    }

    @Override
    public void run() {

        try {
            System.out.println(this.name + " preparing");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " is ready!");
            cb.await();
            cdl_afterPreparing.countDown();

        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        Main.locker.lock();
        if (!Main.isWinner) {
            System.out.println(this.getName() + " is WIN!");
        }
        Main.isWinner = true;
        Main.locker.unlock();
        //callback.accept(this);

        cdl_afterFinish.countDown();

    }
}
