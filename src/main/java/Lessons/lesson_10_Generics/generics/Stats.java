package Lessons.lesson_10_Generics.generics;


public class Stats<E extends Number> {

    private E[] nums;

    public static void main(String[] args) {
        Stats<Integer> integerStats = new Stats<>(1, 2, 3, 4, 5, 6);
        Stats<Double> doubleStats = new Stats<>(1.2, 2.5, 3.2, 4.5, 5.2, 6.0);

        System.out.println("sum ints: " + integerStats.sum());
        System.out.println("sum double: " + doubleStats.sum());
        System.out.println("sum vs sum: " + integerStats.isSumEquals(doubleStats));
    }
    private boolean isSumEquals(Stats<?> o) {
        return Math.abs(sum() - o.sum()) < 0.000001;
    }

    private double sum() {
        var sum = 0.0;
        for (E num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public Stats(E... nums) {
        this.nums = nums;
    }
}

