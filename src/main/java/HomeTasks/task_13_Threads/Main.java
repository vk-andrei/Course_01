package HomeTasks.task_13_Threads;

public class Main {
    public static final int CARS_QTY = 4;

    public static void main(String[] args) {
        System.out.println("ATTENTION >>> PREPARING!!!");
        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_QTY];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
        System.out.println("ATTENTION >>> Race is STARTED!");
        System.out.println("ATTENTION >>> Race is FINISHED!");
    }
}
