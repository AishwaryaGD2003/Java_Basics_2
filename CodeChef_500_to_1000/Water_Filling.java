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
            int B1 = scanner.nextInt();
            int B2 = scanner.nextInt();
            int B3 = scanner.nextInt();
            
            int emptyCount = (B1 == 0 ? 1 : 0) + (B2 == 0 ? 1 : 0) + (B3 == 0 ? 1 : 0);
            
            if (emptyCount >= 2) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }

	}
}
