package Lessons.lesson_14.annotation.main;

//@MyAnnotation
public class Cat {

    @MyAnnotation(priority = 3)
    public int age = 5;

    //@MyAnnotation
    public Cat(@MyAnnotation int age) {
        this.age = age;
    }

    public void doWork (@MyAnnotation String s) {
        System.out.println(s.toUpperCase());
    }
}
