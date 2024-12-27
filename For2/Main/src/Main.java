import java.util.Scanner;   // Importing Java Scanner class
public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter a:");
        int firstNum =sc.nextInt();
        System.out.print("Enter b:");
        int lastNum =sc.nextInt();

        // Display results
        System.out.println("Results:");
        for (int i=firstNum ; firstNum <=lastNum ; firstNum++) {
            System.out.print(firstNum+" ");
        }

        // Close Scanner
        sc.close();
    }
}