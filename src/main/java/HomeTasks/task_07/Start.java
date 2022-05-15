package HomeTasks.task_07;

import java.util.Random;

public class Start {
    public static void main(String[] args) throws InterruptedException {

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Felix", 80);
        cats[1] = new Cat("Tom", 120);
        cats[2] = new Cat("Leo", 95);
       
        //************** Mixing cats *******************
        shuffleCats(cats);
        
        Plate plate1 = new Plate(250);
        plate1.addFood(35);


        for (Cat c : cats) {
            c.eat(plate1);
        }
        System.out.println("-------------");

        for (Cat c : cats) {
            c.catInfo();
        }
    }

    private static void shuffleCats(Cat[] cats) {
        Random rnd = new Random();
        for (int i = 1; i < cats.length; i++) {
                int index = rnd.nextInt(0, i);
                Cat temp = cats[index];
                cats[index] = cats[i];
                cats[i] = temp;
        }
    }
}
