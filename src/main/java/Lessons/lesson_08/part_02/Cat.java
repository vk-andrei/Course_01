package Lessons.lesson_08.part_02;

public class Cat {
    private final Color color;

    public Cat(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color=" + color.getRusName() +
                '}';
    }
}
