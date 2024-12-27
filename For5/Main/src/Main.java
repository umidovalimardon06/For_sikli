import java.util.Scanner;  // Importing Scanner class

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter price of 1kg candy: ");
        int price = sc.nextInt();

        // Display results
        for (float i = 0.1f; i <= 1.1f; i += 0.1f) {
            System.out.printf("%.1f kg candy's price: %.1f%n", i, (i * price));
        }

        // Close Scanner
        sc.close();
    }
}
