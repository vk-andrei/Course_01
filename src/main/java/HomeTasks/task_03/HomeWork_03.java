package HomeTasks.task_03;
import java.util.Arrays;
public class HomeWork_03 {
    public static void main(String[] args) {

        // TASK 1
        int[] myArr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 1) {
                myArr[i] = 0;
            } else {
                myArr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(myArr));
        System.out.println("--------------------");


    }
}
