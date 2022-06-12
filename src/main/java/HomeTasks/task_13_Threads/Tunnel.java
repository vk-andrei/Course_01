package HomeTasks.task_13_Threads;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {

    Semaphore smp;

    public Tunnel(Semaphore smp) {
        this.length = 80;
        this.description = "Tunnel " + length + " meters";
        this.smp = smp;
    }

    @Override
    public void go(Car car) {
        try {
            try {
                System.out.println(car.getName() + " preparing for stage (Waiting): " +
                        description);
                smp.acquire();
                System.out.println(car.getName() + " begin stage: " + description);
                Thread.sleep(length / car.getSpeed() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(car.getName() + " закончил этап: " +
                        description);
                smp.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
