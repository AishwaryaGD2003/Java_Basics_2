import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] weapons = new int[N];
        
        for (int i = 0; i < N; i++) {
            weapons[i] = scanner.nextInt();
        }
        
        int luckyCount = 0;
        int unluckyCount = 0;
        
        for (int i = 0; i < N; i++) {
            if (weapons[i] % 2 == 0) {
                luckyCount++;
            } else {
                unluckyCount++;
            }
        }
        
        if (luckyCount > unluckyCount) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

	}
}
