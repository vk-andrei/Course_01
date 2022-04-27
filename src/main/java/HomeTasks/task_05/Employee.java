package HomeTasks.task_05;

public class Employee {
    private static int countMembers;
    private final String name;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name.toUpperCase();
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        countMembers++;
    }

    public void printInfo() {
        System.out.println(this);  // toString - not necessary
    }

    @Override
    public String toString() {
        return String.format("%-12s%s\n%-12s%s\n%-12s%s\n%-12s%s\n%-12s%d\n%-12s%d",
                             "Employee:", name, "Position:", position, "E-mail:", email, "Phone:", phone,
                             "Salary:", salary, "Age", age);
    }

    public int getAge() {
        return age;
    }

    public static void getCountMembers() {
        System.out.println("Number of all employees: " + countMembers);
    }
}