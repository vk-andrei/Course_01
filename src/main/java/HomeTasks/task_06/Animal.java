package HomeTasks.task_06;

public abstract class Animal {

    public static int counterAnimals;
    private final String nickname;
    private int distanceRun;

    public Animal (String nickname, int distanceRun){
        this.nickname = nickname;
        this.distanceRun = distanceRun;
        counterAnimals++;
    }

    public abstract boolean run();

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }

    public String getNickname() {
        return nickname;
    }

}
