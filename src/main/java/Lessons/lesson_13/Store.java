package Lessons.lesson_13;

public class Store {
    private int product = 0;

    public synchronized void getProduct()  {
        if (product < 1) {
            System.out.println("��������� ���������� � ����������");
            try {
                wait();
                System.out.println("���������� ���������� �����");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product--;
        System.out.println("������������ ��������� �� 1 ������� ������");
        System.out.println("����� ������: " + product);
        notify();
    }

    public synchronized void setProduct() {
        if (product > 3) {
            System.out.println("��������� ���������� � ---��������");
            try {
                wait();
                System.out.println("���������� ---�������� �����");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        product++;
        System.out.println("�������� �������� �� 1 ������� ������");
        System.out.println("����� ������: " + product);
        notify();
    }
}

class MainStore {
    public static void main(String[] args) {

        Store store = new Store();

        //����������
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.getProduct();
            }
        }).start();

        //��������
        new Thread(() -> {
            for (int i = 0; i < 15; i++) {
                store.setProduct();
            }
        }).start();

    }

}
