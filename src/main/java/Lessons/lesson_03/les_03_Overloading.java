package Lessons.lesson_03;

public class les_03_Overloading {                             // TestMethods
    public static void main(String[] args) {

        multiply(3, 4);
        multiply(7);
        multiply(4.3, 5.4);

    }
    // OVERLOADING METHODS
    public static void multiply(int a, int b) {
        int multiply = a * b;
        System.out.printf("Multiply %d and %d is %d(целые)%n", a, b, multiply);
    }
    public static void multiply(double a, double b) {
        double multiply = a * b;
        System.out.printf("Multiply %.7f and %.2f is %f.3(дробные)%n", a, b, multiply);
    }
    public static void multiply(int a) {
        /*int multiply = a * a;
        System.out.printf("Multiply %d and %d is %d(целые)%n", a,a, multiply);*/
        multiply(a, a);
    }

}
