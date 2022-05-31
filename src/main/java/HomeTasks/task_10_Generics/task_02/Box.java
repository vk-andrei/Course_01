package HomeTasks.task_10_Generics.task_02;

import java.util.Arrays;

public class Box<T extends Fruits> { // with EXTENDS we begin to see Fruits methods!
    private T[] fruitsArray;
    private final int id;
    private int currentSize;

    @SafeVarargs
    public Box(int id, T... fruitsArray) {
        this.id = id;
        this.fruitsArray = fruitsArray;
        currentSize = fruitsArray.length;
    }

    public void printInfo() {
        System.out.print("Box " + this.id + ": [ ");
        for (T t : fruitsArray) {
            System.out.print(t.getClass().getSimpleName() + " ");
        }
        System.out.print("]\n");
    }

    public double getWeight() {
        if (fruitsArray.length != 0) {
            return fruitsArray.length * fruitsArray[0].getWeightOneFruit();
        } else {
            return 0;
        }
    }

    public void printBoxWeight() {
        System.out.println("Box " + this.id + " weight: " + this.getWeight() + " kg");
    }

    public boolean compareWeight(Box<?> anyBox) {
        System.out.print("Comparing weight of Box " + this.id + " and Box " + anyBox.id + ": ");
        return anyBox.getWeight() == this.getWeight();
    }

    public void add(T fruit) {
        currentSize++;
        fruitsArray = Arrays.copyOf(fruitsArray, currentSize);
        fruitsArray[currentSize - 1] = fruit;
    }

    public void moveTo(Box<T> anyBox) {
        for (T t : fruitsArray) {
            anyBox.add(t);
        }
        this.fruitsArray = Arrays.copyOf(fruitsArray, 0);  // make box Arr EMPTY
    }
}
