import java.util.Scanner;   // Importing Java Scanner class
public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Enter n:");
        int repeatCount =sc.nextInt();
        System.out.println("Enter k:");
        int symbol =sc.nextInt();

        // Display results
        System.out.println("Result");
        for (int i = 1; i <=repeatCount ; i++) {
            System.out.print(symbol+" ");
        }

        // Close Scanner
        sc.close();
    }
}