import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the customer for the amount of cash
        System.out.print("Enter the amount of cash: ");
        double cash = scanner.nextDouble();
        
        // Prompt the customer for the number of loaves
        System.out.print("Enter the number of loaves: ");
        int numLoaves = scanner.nextInt();
        
        // Price of each loaf
        double loafPrice = 3.5;
        
        // Calculate the total cost
        double totalCost = loafPrice * numLoaves;
        
        // Calculate the change
        double change = cash - totalCost;
        
        if (change >= 0) {
            // Print the receipt
            System.out.println("\n--- Receipt ---");
            System.out.println("Number of loaves: " + numLoaves);
            System.out.println("Loaf price: $" + loafPrice);
            System.out.println("Total cost: $" + totalCost);
            System.out.println("Cash given: $" + cash);
            System.out.println("Change: $" + change);
            
            // Process the transaction
            System.out.println("\nThank you for your purchase!");
            // ... Additional code to complete the transaction
        } else {
            System.out.println("Insufficient cash. Please provide enough to cover the cost.");
        }
        
        scanner.close();
    }
}
