package HomeTasks.task_09;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(){
        super("Array's size not 4x4!");
    }
}
