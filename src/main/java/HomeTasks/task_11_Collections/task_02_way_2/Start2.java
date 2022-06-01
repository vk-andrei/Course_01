package HomeTasks.task_11_Collections.task_02_way_2;

public class Start2 {
    public static void main(String[] args) {
        PhoneBook2 phoneBook = new PhoneBook2();

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
