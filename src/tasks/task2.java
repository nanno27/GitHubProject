package tasks;
import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        int [][] array = makeArray(N);
        sumArrayColumns(array, N);
    }

    static int[][] makeArray(int N) {
        Random random = new Random();
        int rows = N;
        int columns = N;
        int[][] array = new int[rows][columns];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(0, 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        return array;
    }

    static void sumArrayColumns(int[][] array, int N) {
        int rows = N;
        int columns = N;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += array[j][i];
            }
            System.out.println("Сумма " + (i + 1) + " столбца:" + " " + sum);
        }
    }

}
