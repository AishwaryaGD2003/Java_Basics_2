import java.util.Scanner;

public class GreaterAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read integers A, B, and C
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            // Calculate whether the average of A and B is greater than C
            if (A + B > 2 * C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
