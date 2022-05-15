package HomeTasks.task_07;

public class Plate {
    private int qtyFood;

    public Plate(int qtyFood) {
        this.qtyFood = qtyFood;
    }

    public int getQtyFood() {
        return qtyFood;
    }

    public void addFood(int additionalFood) {
        qtyFood += additionalFood;
    }

    public void decreaseFood(int qtyOfFoodCatEat) {
        qtyFood -= qtyOfFoodCatEat;
    }

    public void printInfo(Cat cat, int pieceOfFood) {
        System.out.println(this + cat.getName() + " bit a piece: " + pieceOfFood);
    }

    @Override
    public String toString() {
        return String.format("Plate: %s ", qtyFood);
    }
}