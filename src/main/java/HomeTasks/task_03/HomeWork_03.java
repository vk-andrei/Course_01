package HomeTasks.task_03;
import java.util.Arrays;
public class HomeWork_03 {
    public static void main(String[] args) {

        System.out.println("TASK 1:");
        int[] myArr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("WAS: " + Arrays.toString(myArr));
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == 1) {
                myArr[i] = 0;
            } else {
                myArr[i] = 1;
            }
        }
        System.out.println("NOW: " + Arrays.toString(myArr));
        System.out.println("--------------------");

        System.out.println("TASK 2:");
        int[] myArr2 = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};



    }
}
