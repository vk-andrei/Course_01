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
        int[] myArr2 = new int[100];
        for (int i = 0; i < myArr2.length; i++) {
            myArr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArr2));
        System.out.println("--------------------");

        System.out.println("TASK 3:");
        int[] myArr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("WAS: " + Arrays.toString(myArr3));
        for (int i = 0; i < myArr3.length; i++) {
            if (myArr3[i] < 6) {
                myArr3[i] *= 2;
            }
        }
        System.out.println("NOW: " + Arrays.toString(myArr3));
        System.out.println("--------------------");

        System.out.println("TASK 4:");
        int[][] myArr4 = new int[5][5];
        for (int[] row : myArr4) {
            Arrays.fill(row, 9);
        }
        System.out.println("WAS:");
        for (int[] row : myArr4) {
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < myArr4.length; i++) {
            for (int j = 0; j < myArr4[0].length; j++) {
                if (i == j) {
                    myArr4[i][j] = 1;
                }
                if (i + j == myArr4.length - 1) {
                    myArr4[i][j] = 1;
                }
            }
        }
        System.out.println("NOW:");
        for (int[] row : myArr4) {
            System.out.println(Arrays.toString(row));
        }





        }
}
