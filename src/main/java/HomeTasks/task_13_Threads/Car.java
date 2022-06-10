package HomeTasks.task_13_Threads;

public class Car implements Runnable {
    private static int CARS_COUNT;         // cars_qty?????
    private Race race;
    private int speed;
    private String name;

    private String getName() {
        return name;
    }

    private int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Participant #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " preparing");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " is ready!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }
}
