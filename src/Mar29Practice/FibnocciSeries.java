package Mar29Practice;

public class FibnocciSeries {

	public static void main(String[] args) {
		int[] fibo = new int[10];
		fibo[0] = 0;
		fibo[1]= 1;
		 for(int i = 2; i<fibo.length;i++)
		 {
			 fibo[i]= fibo[i-1]+fibo[i-2];
		 }

		 System.out.println("Fibonacci Series is as below - ");
		 for(int j=0; j<fibo.length; j++)
		 {
			 System.out.print(fibo[j] + " ");
		 }
	}

}
