package temp;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<Person, List<? extends Pet>> personMap = new HashMap<>();

        Person person1 = new Person("IVAN");
        personMap.put(person1, Arrays.asList(new Cat("Барсик"), new Cat("Мурзик")));
        personMap.put(new Person("Маша"), Arrays.asList(new Cat("Васька"), new Dog("Бобик")));
        personMap.put(new Person("Ирина"), Arrays.asList(new Cat("Рыжик"), new Dog("Шарик"), new Parrot("Гоша")));
        personMap.put(person1, Arrays.asList(new Cat("FELIX")));

        System.out.println("personMap: " + personMap);
        System.out.println("personMap.keySet(): " + personMap.keySet());

        for (Person person : personMap.keySet()) {
            System.out.println(person + " имеет");
            for (Pet pet : personMap.get(person)) {
                System.out.println("  " + pet);
            }
        }
    }
}