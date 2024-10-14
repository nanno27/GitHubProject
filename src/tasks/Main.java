package tasks;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        final int task = scanner.nextInt();

        switch (task) {
            case 1:
                task1 runTask1 = new task1();
                runTask1.run();
                break;
            case 2:
                task2 runTask2 = new task2();
                runTask2.run();
                break;
        }
    }
}
