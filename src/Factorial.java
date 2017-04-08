import java.util.Scanner;

public class Factorial {
	
	public int factorial(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number to find out its factoral");
		int n = scan.nextInt() ;
		int f = 1;
		
		for (int i=n; i>=1; i--){
			 f = f*i;
			 		}
		System.out.println("Factorial of " +n +" is -"  +f);
		return f;
	}

	public static void main(String[] args) {
		Factorial f = new Factorial();
		f.factorial();
	

	}

}
