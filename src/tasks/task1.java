package tasks;
import java.util.Scanner;

public class task1 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = scanner.nextLine();
        System.out.println("Количество повторов: ");
        final int N = scanner.nextInt();

        CharSequence result = seqString(string, N);

        System.out.println(result);

        scanner.close();
    }

    static StringBuilder seqString(CharSequence charString, int N) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            stringBuilder.append(charString);
        }
        return stringBuilder;
    }
}
