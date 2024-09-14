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
            int R1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int R3 = scanner.nextInt();
            int R4 = scanner.nextInt();
            
            if (R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0) {
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }
	}
}
