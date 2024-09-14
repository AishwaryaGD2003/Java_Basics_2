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
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            int additionalCandies = N - X;

            if (additionalCandies <= 0) {
                System.out.println(0);
            } else {
                int packetsRequired = (additionalCandies + 3) / 4;
                System.out.println(packetsRequired);
            }
        }
	}
}
