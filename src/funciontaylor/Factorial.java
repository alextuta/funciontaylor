package funciontaylor;

public class Factorial {
	
	public static long factorial(int n){
		
		long fact = 1;
		
		for (int i = 1; i <= n; i++){
			fact = fact*i;
		}
		
		return fact;
	}
}
