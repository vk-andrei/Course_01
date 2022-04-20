package Lessons.lesson_03;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class les_03_RandomScanner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //testRandom();
        testConsoleInput();    // Ñ×ÈÒÛÂÀÅÌ ×ÈÑËÎ

    }

    private static void testConsoleInput() {
        System.out.print("Input number: ");
        int a = getNumFromScanner();
        int b = getNumFromScanner();
        les_03_Overloading.multiply(a, b);

    }

    private static int getNumFromScanner() {
        while (true) {
            System.out.print("Input number: ");
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            System.out.println(scan.next() + " - this is not a number");
        }
    }

    private static void testRandom() {
        int[] data = new int[40];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
//            data[i] = rand.nextInt();         // -2 147 000 000  + 2 147 000 000
//            data[i] = rand.nextInt(10);       //   0   +9
//            data[i] = 3 + rand.nextInt(8);   // 3  +10
//            data[i] = rand.nextInt(3, 11);   // 3  +10
//            data[i] = rand.nextInt(-5, 8);   // -5  +7
//            data[i] = -5 + rand.nextInt(13);   // -5  +7

//            data[i] = (int) (Math.random() * 10);     //  0    +9
//            data[i] = 3 + (int) (Math.random() * 8);     //  3    +10
            data[i] = -5 + (int) (Math.random() * 13);     //  -5    +7
        }
        System.out.println(Arrays.toString(data));

    }


}
