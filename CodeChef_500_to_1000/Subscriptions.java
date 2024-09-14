import java.util.Scanner;

public class Subscriptions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read the number of friends (N) and cost per subscription (X)
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            // Calculate the number of subscriptions needed
            int numberOfSubscriptions = (N + 5) / 6; // Equivalent to ceil(N / 6.0)

            // Calculate the total cost
            int totalCost = numberOfSubscriptions * X;

            // Print the result
            System.out.println(totalCost);
        }

        // Close the scanner
        scanner.close();
    }
}
