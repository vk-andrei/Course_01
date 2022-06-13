package Lessons.lesson_14.annotation.student;

@XTable(tableName = "students")
public class Student {
    @XField
    int id;

    @XField
    String name;

    @XField
    int age;

    String secret;

    int weight = 10;


   public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
