package Lessons.lesson_06.task_13_Threads_var2;

public abstract class Stage {
    protected int length;
    protected String description;

    public String getDescription() {
        return description;
    }
    public abstract void go(Car car);
}
