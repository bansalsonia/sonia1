import java.util.Scanner;

public class PalindromeNumber {
	
	public boolean palin(int PL){
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter Number to be checked - ");
		//int pl = scan.nextInt();
		int temp = PL;
		int lp = 0;
		if(PL<100){
			System.out.println("Please enter atleast 3 digits number !");
		}
		else if(PL>100){
			while(PL>0){
				lp = (lp*10) + (PL%10);
				PL = PL/10;
			}
			System.out.println(PL);
			System.out.println(lp);
			if(lp==temp){
			return true;
			}
		}
			return false;
		}
		
	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
		System.out.println("Is it a Palindrome Number ?? " +pn.palin(898));
		

	}

}
