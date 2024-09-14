import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0; t<T; t++){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if(x == y) {
		        System.out.println("SAME");
		    }
		    else if(x > y){
		        System.out.println("CAR");
		    }
		    else{
		        System.out.println("BIKE");
		    }
		}

	}
}
