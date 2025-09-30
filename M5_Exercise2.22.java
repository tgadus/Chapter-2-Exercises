import java.util.Scanner;

public class Exercise02_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for amount
        System.out.print("Enter amount in integer, for example 1156: ");
        int amount = input.nextInt();

        // Extract dollars and cents
        int dollars = amount / 100;
        int cents = amount % 100;

        // Calculate coin denominations
        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        // Display result
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}