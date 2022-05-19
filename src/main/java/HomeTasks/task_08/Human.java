package HomeTasks.task_08;

public record Human(String name, int runLimit, double jumpLimit) implements Participant {

    @Override
    public void jump() {
        System.out.println("Human is jumping...");
    }

    @Override
    public void run() {
        System.out.println("Human is running...");
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
        return String.format("Human %s", name);
    }
}
