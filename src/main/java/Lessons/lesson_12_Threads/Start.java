package Lessons.lesson_12_Threads;

public class Start {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("New name");
        t.setPriority(10);
        //t.setDaemon(true);
        System.out.println(t);

    }
}
