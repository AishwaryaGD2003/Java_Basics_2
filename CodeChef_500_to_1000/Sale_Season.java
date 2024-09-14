import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		
		for(int i=0; i<T; i++){
		    int X = scanner.nextInt();
            
            int discount = 0;
            if (X > 5000) {
                discount = 500;
            } else if (X > 1000) {
                discount = 100;
            } else if (X > 100) {
                discount = 25;
            }
            
            int finalAmount = X - discount;
            
            System.out.println(finalAmount);
		}

	}
}
