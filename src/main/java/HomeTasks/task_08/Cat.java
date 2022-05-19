package HomeTasks.task_08;

public record Cat(String name, int runLimit, double jumpLimit) implements Participant {

    @Override
    public void jump() {
        System.out.println("Cat is jumping...");
    }

    @Override
    public void run() {
        System.out.println("Cat is running...");
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
        return String.format("Cat %s", name);
    }
}
