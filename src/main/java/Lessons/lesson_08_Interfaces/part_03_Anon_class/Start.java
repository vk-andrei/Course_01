package Lessons.lesson_08_Interfaces.part_03_Anon_class;

public class Start {
    public static void main(String[] args) {

        Greetings greeting1 = new Greetings() {
            @Override
            public void printHello() {
                System.out.println("Hi, motherfucker!");

            }
        };

        Greetings greeting2 = () -> System.out.println("Hi, my dear!");   /// ������ ��������� (�� �� �����, ��� � ����)

        greeting1.printHello();
        greeting2.printHello();

    }
}
