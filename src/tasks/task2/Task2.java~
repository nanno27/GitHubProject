package tasks;
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность двумерного массива: ");
        final int N = scanner.nextInt();

        int [][] array = makeArray(N);
        sumArrayColumns(array, N);
    }

    static int[][] makeArray(int N) {
        Random random = new Random();
        int[][] array = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(0, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void sumArrayColumns(int[][] array, int N) {
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += array[j][i];
            }
            System.out.println("Сумма " + (i + 1) + " столбца:" + " " + sum);
        }
    }

}
