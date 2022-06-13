package HomeTasks.task_14_LogsAndTesting.part_03_Timofei;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Array's size not 4x4!");
    }
}
