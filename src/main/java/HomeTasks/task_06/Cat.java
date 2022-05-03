package HomeTasks.task_06;

public class Cat extends Animal {

    public static int counterCats;

    public Cat(String nickname, int distanceRun) {
        super(nickname, distanceRun);
        counterCats++;
    }

    @Override
    public boolean run() {
        return getDistanceRun() < 200;
    }
}
