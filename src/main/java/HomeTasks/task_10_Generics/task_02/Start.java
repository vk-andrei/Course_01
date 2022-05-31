package HomeTasks.task_10_Generics.task_02;

public class Start {
    public static void main(String[] args) {

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple[] apples = {apple1, apple2, apple3};

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange[] oranges = {orange1, orange2, orange3};

        Box<Apple> box1 = new Box<>(1, apples);
        Box<Orange> box2 = new Box<>(2, oranges);
        Box<Fruits> box3 = new Box<>(4, orange4, orange5);
        Box<Apple> box4 = new Box<>(5, apple5);

        box1.printInfo();
        box2.printInfo();
        box3.printInfo();
        box3.printInfo();
        box4.printInfo();
        System.out.println("----------");

        box1.printBoxWeight();
        box2.printBoxWeight();
        box3.printBoxWeight();
        box3.printBoxWeight();
        box4.printBoxWeight();
        System.out.println("----------");

        System.out.println(box1.compareWeight(box2));
        System.out.println(box1.compareWeight(box3));
        System.out.println("----------");

        System.out.println("AFTER MOVING from Box1 to Box 5:");
        box1.moveTo(box4);
        box1.printInfo();
        box4.printInfo();
        box1.printBoxWeight();
        box4.printBoxWeight();
        System.out.println("----------");
    }
}

