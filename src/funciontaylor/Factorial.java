package funciontaylor;

public class Factorial {
	
	public long factorial(int n){
		
		long fact = 1;
		
		for (int i = 0; i <= n; i++){
			fact = fact*i;
		}
		
		return fact;
	}
}
