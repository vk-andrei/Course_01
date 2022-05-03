package HomeTasks.task_06;

public class Dog extends Animal{

    private int distanceSwim;
    public static int counterDog;

    public Dog(String nickname, int distanceRun, int distanceSwim) {
        super(nickname, distanceRun);
        this.distanceSwim = distanceSwim;
        counterDog++;
    }

    @Override
    public boolean run() {
        return getDistanceRun() < 500;
    }

    public boolean swim() {
        return getDistanceSwim() < 10;
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }
    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

}
