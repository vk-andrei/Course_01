package HomeTasks.task_06;

public class Start {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobby", 499, 5);
        Dog dog2 = new Dog("Hatiko", 501, 15);
        Dog dog3 = new Dog("Volt", 500, 10);

        Cat cat1 = new Cat("Felix", 199);
        Cat cat2 = new Cat("Tom", 201);

        cat2.setDistanceRun(250);
        dog3.setDistanceSwim(11);

        System.out.println("Can a dog " + dog1.getNickname() + " run " + dog1.getDistanceRun() + "km?: " + dog1.run());
        System.out.println("Can a dog " + dog1.getNickname() + " swim " + dog1.getDistanceSwim() + "km?: " + dog1.swim());
        System.out.println("Can a dog " + dog2.getNickname() + " run " + dog2.getDistanceRun() + "km?: " + dog2.run());
        System.out.println("Can a dog " + dog2.getNickname() + " swim " + dog2.getDistanceSwim() + "km?: " + dog2.swim());
        System.out.println("Can a dog " + dog3.getNickname() + " run " + dog3.getDistanceRun() + "km?: " + dog3.run());
        System.out.println("Can a dog " + dog3.getNickname() + " swim " + dog3.getDistanceSwim() + "km?: " + dog3.swim());

        System.out.println("Can a cat " + cat1.getNickname() + " run " + cat1.getDistanceRun() + "km?: " + cat1.run());
        System.out.println("Can a cat " + cat2.getNickname() + " run " + cat2.getDistanceRun() + "km?: " + cat2.run());

        System.out.println("\nThere are " + Animal.counterAnimals + " animals: " + Dog.counterDog +
                           " dogs and " + Cat.counterCats + " cats.");

    }
}
