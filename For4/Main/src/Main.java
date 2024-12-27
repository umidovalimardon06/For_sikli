import java.util.Scanner;  // Importing Scanner from Scanner class

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter price of 1kg cand:");
        int price = sc.nextInt();


        // Display results
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + "kg "+ "cand's price: "+(i*price));
        }

        // Scanner close
        sc.close();
    }
}