
public class FibnocciSeries {
	
	public void fibonacci(){
		int[] fibo = new int[15];
		fibo[0]= 0;
		fibo[1]=1;
		for(int i = 2; i<fibo.length; i++)
		{
			fibo[i]= fibo[i-2]+fibo[i-1]; 
		}
		//to print the elements in array i.e. Fibonacci Series.
		
		for(int i=0; i<fibo.length;i++)
		{
			System.out.print(fibo[i] +" ");
		}
	}

	public static void main(String[] args) {
		FibnocciSeries f = new FibnocciSeries();
		f.fibonacci();
		
		

	}

}
