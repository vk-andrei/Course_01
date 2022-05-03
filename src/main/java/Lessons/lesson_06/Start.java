package Lessons.lesson_06;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Knight knight1 = new Knight("Andrei", 100, "Knight", "Excalibur");

        Wizard wizard1 = new Wizard("Lena", 150, "Wizard");

        knight1.printInfo();
        wizard1.printInfo();
        knight1.savePrincess();

        knight1.action();
        wizard1.action();

        System.out.println();
        System.out.println("EXAMPLE OF POLYMORPHISM");
        testPolymorphism(knight1);                      // это метод для PLAYER, но мы передаем туда его наследников
        testPolymorphism(wizard1);

        System.out.println();
        System.out.println("ДОКАЗ-ВО, ЧТО ВСЕ ОБЪЕКТЫ НАСЛЕДНИКИ КЛАССА OBJECT");
        Object[] objects = {
                new Date(),
                knight1,
                new Scanner(System.in),
                45,
                "Hello",
                true,
                new int[]{1, 2, 3}
        };
        System.out.println(Arrays.toString(objects));
    }

    public static void testPolymorphism(Player player) {
        player.action();
        System.out.println("Player " + player.getNickname() + " finished job.");
        System.out.println();

        if (player instanceof Knight) {
            Knight k = (Knight) player;
            k.savePrincess();
        }

    }
}

