import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Завдання 3:
        long product = 1;
        boolean hasNonZero = false;

        System.out.println("Введіть цілі числа для обчислення добутку (введіть 0 для закінчення):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;  // Якщо введено 0, завершуємо цикл
            product *= num;
            hasNonZero = true;
        }

        if (hasNonZero) {
            System.out.println("Добуток введених чисел: " + product);
        } else {
            System.out.println("Жодне ненульове число не було введене.");
        }

        // Завдання 4
        int longStringCount = 0;
        System.out.println("\nВводьте рядки (введіть 'done' для завершення):");
        scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("done")) break;  // Якщо введено "done", завершуємо цикл
            if (input.length() > 10) longStringCount++;
        }

        System.out.println("Кількість рядків з довжиною більше 10 символів: " + longStringCount);
    }
}

