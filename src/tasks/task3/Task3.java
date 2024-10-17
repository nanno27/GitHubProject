package tasks.task3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        employees.add(new Director("Никита", "03.06.2003", "Мужской", "Директор"));
        employees.add(new Director("Тигран", "24.05.2003", "Мужской", "Директор"));
        employees.add(new Cashier("Идрис", "03.03.2003", "Мужской", "Кассир"));
        employees.add(new Manager("Матвей", "03.03.2003", "Мужской", "Менеджер"));

        for (Employee employee : employees) {
            employee.promote();
        }

        for (Employee employee : employees) {
            employee.EmployeeInfo();
        }

        scanner.close();
    }
}

class Employee {
    protected String name;
    protected String birthday;
    protected String gender;
    protected String position;

    public Employee(String name, String birthday, String gender, String position) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.position = position;
    }

    public void EmployeeInfo() {
        System.out.println(name + " " + birthday + " " + gender + " " + position);
    }

    public void promote(){
        //
    }

}


class Manager extends Employee {
    public Manager(String name, String birthday, String gender, String position) {
        super(name, birthday, gender, position);
    }
    @Override
    public void promote() {
        this.position = "Директор";
    }
}

class Director extends Employee {
    public Director(String name, String birthday, String gender, String position) {
        super(name, birthday, gender, position);
    }
    @Override
    public void promote() {
        this.position = "Основатель";
    }
}

class Cashier extends Employee {
    public Cashier(String name, String birthday, String gender, String position) {
        super(name, birthday, gender, position);
    }
    @Override
    public void promote() {
        this.position = "Менеджер";
    }
}

