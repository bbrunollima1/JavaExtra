import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in) ;
		
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		
		
		double notaFinal = nota1 + nota2;
		
		System.out.printf("Nota final = %.1f%n" , notaFinal);
		
		if(notaFinal < 60) {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}

}
