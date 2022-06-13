package HomeTasks.task_14_LogsAndTesting.part_03_Timofei;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int r, int c) {
        super(String.format("In row %s, column %s - not a string", r, c));

    }
}
