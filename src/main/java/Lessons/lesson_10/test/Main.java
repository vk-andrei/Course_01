package Lessons.lesson_10.test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Generic<Object> o = new Generic<Object>();
//        Generic<A> a = new Generic<A>();
//        Generic<B> b = new Generic<B>();
        Generic<? super D> c = new Generic<C>();
        Generic<? super D> d = new Generic<D>();
//        Generic<? super D> e = new Generic<E>();
        ArrayList<Integer> arrayList = new ArrayList<>();
    }
}