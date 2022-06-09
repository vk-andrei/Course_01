package Lessons.lesson_13;

public class Store {
    private int product = 0;

    public synchronized void getProduct()  {
        if (product < 1) {
            System.out.println("Сработала блокировка у ПОКУПАТЕЛЯ");
            try {
                wait();
                System.out.println("Блокировка ПОКУПАТЕЛЯ снята");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("Пользователь закупился на 1 единицу товара");
        System.out.println("Всего товара: " + product);
        notify();
    }

    public synchronized void setProduct() {
        if (product > 3) {
            System.out.println("Сработала блокировка у ---ПРОДАВЦА");
            try {
                wait();
                System.out.println("Блокировка ---ПРОДАВЦА снята");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("Продавец пополнил на 1 единицу товара");
        System.out.println("Всего товара: " + product);
        notify();
    }
}

class MainStore {
    public static void main(String[] args) {

        Store store = new Store();

        //покупатель
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.getProduct();
            }
        }).start();

        //продавец
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.setProduct();
            }
        }).start();

    }

}
