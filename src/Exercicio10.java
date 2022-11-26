import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in) ;
		
		int n = entrada.nextInt();
	    String[] nomes = new String[n];
	    int[] idades = new int[n];
	    double[] alturas = new double[n];
	    
	    for(int i=0; i<n; i++) {
	    	nomes[i] = entrada.next();
	    	idades[i] = entrada.nextInt();
	    	alturas[i] = entrada.nextDouble();
	    
	    	}
	    
	    double soma = 0.0;
	    for(int i=0; i<n; i++) {
	    	soma= soma + alturas[i];
	    }
	    
	    double media = soma /n;
	    System.out.printf("Altura media: %.2f%n" , media);
	    
	    int cont=0;
	    for(int i=0; i<n; i++) {
	    	if(idades[i] < 16 ) {
	    		cont++;
	    	}
	    }
	    double x = cont * 100.0/n;
	    System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",x);
	    
	    entrada.close();
	    
	}

}
