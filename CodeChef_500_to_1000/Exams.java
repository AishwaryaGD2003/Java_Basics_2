import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // Number of test cases

        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();  // Number of schools
            int Y = sc.nextInt();  // Number of students per school
            int Z = sc.nextInt();  // Number of students who passed

            // Total number of students
            int totalStudents = X * Y;

            // Check if number of students who passed is more than 50% of total students
            if (Z > 0.5 * totalStudents) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

	}
}
