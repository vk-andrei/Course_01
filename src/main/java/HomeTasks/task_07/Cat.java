package HomeTasks.task_07;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate anyPlate) throws InterruptedException {

        if (anyPlate.getQtyFood() < appetite) {
            System.out.printf("There is not enough food for %s in this plate\n", name);
        } else {
            satiety = true;
            int catCapacity = 0;
            while (anyPlate.getQtyFood() > 0) {
                int catBite = 3 + (int) (Math.random() * 4);
                anyPlate.decreaseFood(catBite);
                catCapacity += catBite;
                if (anyPlate.getQtyFood() < 0 || catCapacity >= appetite) {
                    break;
                }
                anyPlate.printInfo(this, catBite);
                Thread.sleep(75);
            }
        }
    }
    public void catInfo() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        String s = (satiety) ? "satiety" : "hungry";
        return String.format("Cat %s is %s", name, s);
    }
}
