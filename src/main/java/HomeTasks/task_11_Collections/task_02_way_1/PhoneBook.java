package HomeTasks.task_11_Collections.task_02_way_1;

import java.util.*;

public class PhoneBook {

    private final Map<String, String> phonesMap = new HashMap<>();

    public void add(String name, String phone) {
        if (phonesMap.containsKey(name)) {
            phonesMap.put(name, (phonesMap.get(name)) + ", " + phone);
        } else {
            phonesMap.put(name, phone);
        }
    }

    public void get(String name) {
        if (phonesMap.containsKey(name)) {
            System.out.println(name + ": " + phonesMap.get(name));
        } else {
            System.out.println("There is no such Person");
        }
    }

    public void printSetInfo() {
        phonesMap.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
