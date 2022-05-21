package Lessons.lesson_08_Interfaces.part_02;

public enum Color {
    ORANGE("�����", 3),
    RED("�������", 4),
    GREY("�����", 2),
    BLACK("������", 3);

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
