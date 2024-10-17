package tasks;
import tasks.task1.Task1;
import tasks.task2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        final int task = scanner.nextInt();

        switch (task) {
            case 1:
                Task1 runTask1 = new Task1();
                runTask1.run();
                break;
            case 2:
                Task2 runTask2 = new Task2();
                runTask2.run();
                break;
        }


        scanner.close();
    }
}
