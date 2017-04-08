package Mar29Practice;

import java.util.Scanner;

public class CheckPrimeNumber {
		

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked - ");
		 int p = scan.nextInt();
		int r, flag=0, m=0  ;
		m=p/2;
			
		for(int i=2;i<=m; i++)
		{
			r = p%i;
			
			if(r == 0){
				System.out.println("Not a Prime Number ");
				flag=1;
				break;
			}
		}
			if (flag ==0) 
		System.out.println("Prime Number ");			
			
		
	}
}
			
		
		
	