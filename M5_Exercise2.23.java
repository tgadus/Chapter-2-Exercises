import java.util.Scanner;

public class Exercise02_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for driving distance
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        // Prompt user for miles per gallon
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        // Prompt user for price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate cost of driving
        double cost = (distance / milesPerGallon) * pricePerGallon;

        // Display result
        System.out.println("The cost of driving is $" + cost);
    }
}