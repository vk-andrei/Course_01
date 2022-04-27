package HomeTasks.task_05;

public class Start {
    public static void main(String[] args) {

        Employee[] employeesArr = new Employee[5];

        employeesArr[0] = new Employee("Andrei", "boss", "andrei@mail.ru",
                                "+7-919-795-66-20", 100000, 39);
        employeesArr[1] = new Employee("Dmitri", "manager", "dmitri12@mail.ru",
                                "+7-919-795-66-30", 70000, 42);
        employeesArr[2] = new Employee("Danya", "manager", "danya231@mail.ru",
                                "+7-919-795-66-40", 70000, 31);
        employeesArr[3] = new Employee("Nick", "teacher", "nick123123@mail.ru",
                                "+7-919-795-66-50", 700, 50);
        employeesArr[4] = new Employee("Bubble", "bubble", "bubble@mail.ru",
                                "+7-919-795-66-60", 20, 28);

        for (Employee employee : employeesArr) {
            if (employee.getAge() > 40) {
                employee.printInfo();
                System.out.println("-------------");
            }
        }

        Employee.getCountMembers();
    }
}
