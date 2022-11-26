import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
	    double[] vet = new double[n];
	    
	    for( int i = 0; i<n; i++) {
	    	vet[i]= entrada.nextDouble();
	    }
	    
	    for( int i = 0; i<n; i++) {
	    	System.out.println(vet[i] + " ");
	    }
	    
	    System.out.println();
	    
	    double soma = 0.0;
	    
	    for( int i = 0; i<n; i++) {
	    	soma = soma + vet[i];
	    }
	    
	    System.out.printf("%.2f%n" , soma);
	    
	    double media = soma / n ;
	    
	    System.out.printf("%.2f%n", media);
	    
	    entrada.close();
	}

}
