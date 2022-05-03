package Lessons.lesson_06;

public class Knight extends Player {

    private String swordTitle;

    public Knight(String nickname, int points, String position, String swordTitle) {
        super(nickname, points, position); // обращение к родительскому конструктору
        this.swordTitle = swordTitle;
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }

    public void savePrincess() {
        System.out.println(getPosition() + " " + getNickname() + " saves Princess");
    }

    @Override
    public void action() {
        System.out.printf("%s %s fighting with %s%n" , getPosition(), getNickname(), getSwordTitle());
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" and has weapon %s", getSwordTitle());

    }
}

