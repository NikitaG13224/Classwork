import java.util.Scanner;

public class MiddleNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;
        int middle = sum - min - max;

        System.out.println("Среднее число: " + middle);

        scanner.close();
    }
}
