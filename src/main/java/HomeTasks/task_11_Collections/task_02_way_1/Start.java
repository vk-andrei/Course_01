package HomeTasks.task_11_Collections.task_02_way_1;

public class Start {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Benzema", "111111");
        phoneBook.add("Ronaldo", "222222");
        phoneBook.add("Modric", "333333");
        phoneBook.add("Benzema", "112233");
        phoneBook.add("Bale", "332211");
        phoneBook.add("Chestnov", "666666");
        phoneBook.add("Ronaldo", "999999");

        phoneBook.printSetInfo();

        System.out.println("==========================");
        phoneBook.get("Ronaldo");
        phoneBook.get("Chestnov");
    }
}
