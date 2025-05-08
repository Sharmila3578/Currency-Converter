import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Currency Converter ---");
            System.out.println("1. Convert Currency");
            System.out.println("2. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("From (INR, USD, EUR, GBP): ");
                String from = sc.nextLine().toUpperCase();
                System.out.print("To (INR, USD, EUR, GBP): ");
                String to = sc.nextLine().toUpperCase();
                System.out.print("Amount: ");
                double amount = sc.nextDouble();

                double result = converter.convert(from, to, amount);
                System.out.printf("Converted amount: %.2f %s%n", result, to);
            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}
