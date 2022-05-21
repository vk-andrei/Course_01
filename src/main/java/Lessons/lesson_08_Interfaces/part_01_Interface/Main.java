package Lessons.lesson_08_Interfaces.part_01_Interface;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Plane plane = new Plane();
        Wolf wolf = new Wolf();

        test(cat);
        test(dog);
        test(duck);
        //test(plane); - не бегает
        test(wolf);

        Flying[] flyings = {duck, plane};
    }

    private static void test (Runner runner) {
        runner.run();
    }
}
