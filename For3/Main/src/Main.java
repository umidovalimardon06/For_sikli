import java.util.Scanner;  // Importing Scanner from Scanner class

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter startNum:");
        int startNum = sc.nextInt();
        System.out.print("Enter endNum:");
        int endNum = sc.nextInt();

        // Initialize variable for counting
        int count=0;

        // Display results
        for (int i = endNum-1; i > startNum ; i--) {

            System.out.println(i);
            count++;

        }

        System.out.println("Numbers printed "+count);


        // Scanner close
        sc.close();
    }
}