import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число X (от -1000 до 1000): ");

        // Проверка, что введено именно целое число
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено не целое число.");
            return;
        }
        int X = scanner.nextInt();

        if (X < -1000 || X > 1000) {
            System.out.println("Ошибка: число должно быть в диапазоне от -1000 до 1000.");
            return;
        }
        if (X == 0) {
            System.out.println("Число: " + X);
            System.out.println("Наименьшая цифра: 0");
            System.out.println("Наибольшая цифра: 0");
            return;
        }

        int n = Math.abs(X);
        int minDigit = 9;
        int maxDigit = 0;

        while (n > 0) {
            int digit = n % 10;
            minDigit = Math.min(minDigit, digit);
            maxDigit = Math.max(maxDigit, digit);
            n /= 10;
        }

        System.out.println("Число: " + X);
        System.out.println("Наименьшая цифра: " + minDigit);
        System.out.println("Наибольшая цифра: " + maxDigit);

        scanner.close();
    }
}
