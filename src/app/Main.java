package app;


    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите сумму дохода: ");
            double income = scanner.nextDouble();

            double tax = 0.0;

            if (income <= 10000) {
                tax = income * 0.025;
            } else if (income <= 25000) {
                tax = 10000 * 0.025 + (income - 10000) * 0.043;
            } else {
                tax = 10000 * 0.025 + 15000 * 0.043 + (income - 25000) * 0.067;
            }

            System.out.printf("Сумма налога: %.2f\n", tax);
        }
    }

