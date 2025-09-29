import java.util.Scanner;

public class Exercise02_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for balance and annual interest rate
        System.out.print("Enter balance and annual interest rate: ");
        double balance = input.nextDouble();
        double annualInterestRate = input.nextDouble();

        // Calculate monthly interest
        double interest = balance * (annualInterestRate / 1200);

        // Display result
        System.out.printf("The interest is %.2f\n", interest);
    }
}