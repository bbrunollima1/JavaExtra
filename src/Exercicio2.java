import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in) ;
		
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		
		double delta= b * b - 4.0 * a * c ;
		
		
		if ( a == 0  || delta < 0.0) {
			
			System.out.println("Impossível calcular");
		}
		
		else {
			
			double r1 = (-b + Math.sqrt(delta))/ (2*a);
			double r2 = (-b - Math.sqrt(delta))/ (2*a);
			
		
			System.out.printf("r1 = %.5f%n" ,r1);
			System.out.printf("r2 = %.5f%n" ,r2);
		}
		
	
		entrada.close();
	}

}
