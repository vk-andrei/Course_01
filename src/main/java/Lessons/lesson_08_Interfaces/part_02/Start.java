package Lessons.lesson_08_Interfaces.part_02;

public class Start {
    public static void main(String[] args) {

        // testEnum();
        testInnerClass();
    }

    private static void testEnum() {
        Cat cat = new Cat(Color.ORANGE);
        System.out.println(cat);
    }

    private static void testInnerClass() {

        Cat cat = new Cat(Color.ORANGE);
        Cat.CatAttributes catAttributes1 = cat.new CatAttributes("Felix", 4, 12);

        Cat cat2 = new Cat("TOM", 4, 20, Color.ORANGE);

        System.out.println(catAttributes1);
        System.out.println(cat);
        System.out.println(cat2);
    }


}
