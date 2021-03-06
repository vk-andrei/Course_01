package Lessons.lesson_06.task_13_Threads_var2;

public class Road extends Stage {

    public Road(int length) {
        this.length = length;
        this.description = "Road "+ length + " meters";
    }

    @Override
    public void go(Car car) {
        try {
            System.out.println(car.getName() + " begin stage: " + description);
            Thread.sleep(length / car.getSpeed()* 1000L);
            System.out.println(car.getName() + " finished stage: " + description);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
