package Lessons.lesson_05;

public class Player {

    private final String nickName;
    private final int points;
    int level;
    private int money;

    public Player(String nickName, int points, int level, int money) {
        this.nickName = nickName.toUpperCase();
        this.points = points;
        this.level = level;
        setMoney(money);
    }

    public  Player(String nickName){
        this(nickName, 0, 1, 100);
    }

    public void printInfo () {
        System.out.print(this.toString());
    }

    public String toString() {
        return String.format("Player %s (%d level) %d money and %d points%n", nickName, level, money, points);
    }

    void jump() {
        System.out.println(nickName + " is jumping");
    }

    public void setMoney (int money) {
        if (money < 0) {
            System.out.println("It s too less!");
        } else {
            this.money = money;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMoney() {
        return money;
    }
}
