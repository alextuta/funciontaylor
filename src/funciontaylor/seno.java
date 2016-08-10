package funciontaylor;

public class seno {
	public static  double seno (double x){
	double s=x;
		
		for (int i = 0; i <10; i++) {
			s=(((Potencia.potencia(x, (2*i)+1))*(Potencia.potencia(-1, i)))/(Factorial.factorial((2*i)+1)))+s;
			
		}
		return s;
		
	}

}
