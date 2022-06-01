package HomeTasks.task_11_Collections.task_02_way_2;

import java.util.*;

public class PhoneBook2 {

    private final Map<String, ArrayList<String>> phonesMap = new HashMap<>();

    public void add(String name, String phone) {
        if (!phonesMap.containsKey(name)) {
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(phone);
            phonesMap.put(name, arrayList);
        } else {
           phonesMap.get(name).add(phone);
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
