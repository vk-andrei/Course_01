package HomeTasks.task_08;

public record Robot(String name, int runLimit, double jumpLimit) implements Participant {

    @Override
    public void jump() {
        System.out.println("Robot is jumping...");
    }

    @Override
    public void run() {
        System.out.println("Robot is running...");
    }

    @Override
    public int getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }

    @Override
    public String toString() {
        return String.format("Robot %s", name);
    }
}
