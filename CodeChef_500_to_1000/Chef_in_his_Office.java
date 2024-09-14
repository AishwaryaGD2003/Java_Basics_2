import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int i = 0; i < T; i++) {
            // Read X and Y for each test case
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            // Calculate total working hours in one week
            int totalWorkingHours = 4 * X + Y;
            
            // Output the result for the current test case
            System.out.println(totalWorkingHours);
        }

	}
}
