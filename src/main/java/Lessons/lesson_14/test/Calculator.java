package Lessons.lesson_14.test;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(-3, 5) == -2);
    }

    public Calculator() {
        System.out.println("����������� ������");
    }

    public int add(int a, int b) {
        System.out.println("����������� ��������");
        return a + b;
    }

    public int div(int a, int b) {
        System.out.println("����������� �������");
        return a / b;
    }
}
