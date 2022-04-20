package HomeTasks.task_03;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_03_task_01_06 {
    public static void main(String[] args) {

        System.out.println("TASK 1:");
        int[] myArr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
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
        System.out.println("--------------------");

        System.out.println("TASK 5:");
        int len = 5;                      // array length
        int initialValue = 9;             // value of cells
        System.out.println(Arrays.toString(arrayMaker(len, initialValue)));
        System.out.println("--------------------");

        System.out.println("TASK 6:");
        Random ran = new Random();
        int[] myArr5 = new int[5 + ran.nextInt(16)];   // 5...20
        for (int i = 0; i < myArr5.length; i++) {
            myArr5[i] = ran.nextInt(-100, 101);
        }
        System.out.println(Arrays.toString(myArr5));
        Arrays.sort(myArr5);
        System.out.println("Min number: " + myArr5[0]);
        System.out.println("Max number: " + myArr5[myArr5.length - 1]);
        System.out.println("--------------------");

        System.out.println("TASK 7:");
        int[] myArr6 = new int[]{2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(myArr6));


    }

    private static int[] arrayMaker(int arrayLength, int valueOfCell) {
        int[] arr = new int[arrayLength];
        Arrays.fill(arr, valueOfCell);
        return arr;
    }

    private static boolean checkBalance(int[] arr) {
        int sum1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum1 += arr[i];
            int sum2 = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum2 += arr[j];
            }
            System.out.print(sum1 + "   " + sum2);
            System.out.println();
            if (sum1 == sum2) return true;
        }
        return false;
    }
}
