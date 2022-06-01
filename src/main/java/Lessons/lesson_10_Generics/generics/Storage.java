package Lessons.lesson_10_Generics.generics;

public interface Storage<E> {

    void add(E value);

    void add(E value, int index);

    void remove(int index);

    E get(int index);

    boolean find(E value);

    void display();

    void sort();

    int getCurrentSize();
}