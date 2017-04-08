import java.util.Scanner;

public class PalindromeString {
	
	public void palin(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be checked - ");
		String s1 = scan.nextLine();
		String s2 = "";
		// to build s2 same as reverse of s1
		for(int i = s1.length()-1; i>=0;i--){
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		if(s2.equals(s1))
		{System.out.println("Palindrome String");
		}
		else{
			System.out.println("Not a Palindrome String");
		}
		
		
		
	}

	public static void main(String[] args) {
		PalindromeString ps = new PalindromeString();
		ps.palin();
		

	}

}
