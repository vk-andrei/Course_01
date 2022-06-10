package HomeTasks.task_12_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("1. Without threads:");
        TestThreads testThreads1 = new TestThreads();
        testThreads1.testArrayWithoutThreads();

        System.out.println("\n2. With threads:");
        TestThreads testThreads2 = new TestThreads();
        testThreads2.testArrayWithThreads();
    }
}
