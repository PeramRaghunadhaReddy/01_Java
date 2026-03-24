package task.conditional.loops;

import java.util.Scanner;

public class TransactionFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter transaction type (deposit, withdrawal, transfer): ");
        String transactionType = scanner.nextLine().toLowerCase();

        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();

        double feePercentage;
        double fee;

        switch (transactionType) {
            case "deposit":
                feePercentage = 0.0;
                break;
            case "withdrawal":
                feePercentage = 0.02; // 2%
                break;
            case "transfer":
                feePercentage = 0.015; // 1.5%
                break;
            default:
                feePercentage = 0.0; // Invalid transaction type
                System.out.println("Invalid transaction type. No fee applied.");
        }

        fee = amount * feePercentage;
        System.out.println("Transaction Amount: ₹" + amount);
        System.out.println("Transaction Type: " + transactionType);
        System.out.println("Transaction Fee: ₹" + fee);

        scanner.close();
    }
}

