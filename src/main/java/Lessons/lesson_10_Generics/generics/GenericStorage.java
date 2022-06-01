package Lessons.lesson_10_Generics.generics;

public class GenericStorage<E extends Comparable<? super E>> {
    private final E[] data;
    private static final int DEFAULT_SIZE = 16;
    private int currentSize;

    public GenericStorage(int size) {
        this.data = (E[])new Object[size];
        currentSize = 0;
    }

    public GenericStorage() {
        this(DEFAULT_SIZE);
    }

    public void add(E value) {
        add(value, currentSize);
    }


    public void add(E value, int index) {
        data[index] = value;
        currentSize++;
    }

    public void display() {
        for (E datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }

    public void remove(int index) {
        data[index] = null;
        currentSize--;
    }

    public boolean find(E value) {
        for (int i = 0; i < currentSize; i++) {
            if (value.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                E a = data[i];
                E b = data[j];
                if (a.compareTo(b) > 0) {
                    exchange(i, j);
                }
            }
        }
    }
    private void exchange(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public E get(int index) {
        return data[index];
    }

    public void removeLast() {
        remove(--currentSize);
    }
}
