import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		
		if (X == A || X == B || X == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

	}
}
