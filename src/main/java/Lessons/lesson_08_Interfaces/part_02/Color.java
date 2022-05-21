package Lessons.lesson_08_Interfaces.part_02;

public enum Color {
    ORANGE("Рыжий", 3),
    RED("Красный", 4),
    GREY("Серый", 2),
    BLACK("Черный", 3);

    private String rusName;
    private int weight;

    Color(String rusName, int weight) {
        this.rusName = rusName;
        this.weight = weight;
    }

    public String getRusName() {
        return rusName;
    }

}
