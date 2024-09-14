import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void Assignments(int x)
    {
        int timeRemaining = 10 - x;
        if(timeRemaining >= 3) 
        {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }
    }
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++)
		{
		int x = sc.nextInt();
		Assignments(x);
		}

	}
}
