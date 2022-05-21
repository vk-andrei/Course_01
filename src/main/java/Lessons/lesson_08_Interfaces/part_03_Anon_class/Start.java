package Lessons.lesson_08_Interfaces.part_03_Anon_class;

public class Start {
    public static void main(String[] args) {

        Greetings greeting1 = new Greetings() {
            @Override
            public void printHello() {
                System.out.println("Hi, motherfucker!");

            }
        };

        Greetings greeting2 = () -> System.out.println("Hi, my dear!");   /// лямбда выражение (то же самое, что и выше)

        greeting1.printHello();
        greeting2.printHello();

    }
}
