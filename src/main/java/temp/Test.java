package temp;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<Person, List<? extends Pet>> personMap = new HashMap<>();

        Person person1 = new Person("IVAN");
        personMap.put(person1, Arrays.asList(new Cat("������"), new Cat("������")));
        personMap.put(new Person("����"), Arrays.asList(new Cat("������"), new Dog("�����")));
        personMap.put(new Person("�����"), Arrays.asList(new Cat("�����"), new Dog("�����"), new Parrot("����")));
        personMap.put(person1, Arrays.asList(new Cat("FELIX")));

        System.out.println("personMap: " + personMap);
        System.out.println("personMap.keySet(): " + personMap.keySet());

        for (Person person : personMap.keySet()) {
            System.out.println(person + " �����");
            for (Pet pet : personMap.get(person)) {
                System.out.println("  " + pet);
            }
        }
    }
}