package Lessons.lesson_06;

public class Player {
    private String nickname;
    private int points;
    private String position;

//    public Player (){
//    }

    public Player(String nickname, int points, String position) {
        this.nickname = nickname;
        this.points = points;
        this.position = position;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("%s %s has %d points", position, nickname, points);
    }

    public void action() {
        System.out.println("Player do something");
    }

}
