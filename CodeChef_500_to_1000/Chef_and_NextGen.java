import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int totalPowerRequired = A * B;
            int totalPowerAvailable = X * Y;
            
            if (totalPowerAvailable >= totalPowerRequired) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
	}
}
