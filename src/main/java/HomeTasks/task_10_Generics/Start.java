package HomeTasks.task_10_Generics;

public class Start {
    public static void main(String[] args) {

        GenericArray<Integer> myArr1 = new GenericArray<>(1, 2, 3);
        GenericArray<Integer> myArr2 = new GenericArray<>(4, 5, 6);

        GenericArray<String> myArr3 = new GenericArray<>("A", "B", "C");
        GenericArray<String> myArr4 = new GenericArray<>("D", "E", "F");

        myArr1.printInfo("myArr1");
        myArr2.printInfo("myArr2");
        myArr3.printInfo("myArr3");
        myArr4.printInfo("myArr4");

        System.out.println("AFTER REPLACING");

        myArr1.change( 1, myArr2, 0);
        myArr3.change( 2, myArr4, 0);

        myArr1.printInfo("myArr1");
        myArr2.printInfo("myArr2");
        myArr3.printInfo("myArr3");
        myArr4.printInfo("myArr4");
    }
}
