import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner entrada = new Scanner(System.in);
		
	    int n = entrada.nextInt();
	    int[] vet = new int[n];
	    
	    for( int i = 0; i<n; i++) {
	    	vet[i]= entrada.nextInt();
	    }
	    
	    for( int i = 0; i<n; i++) {
	    	if(vet[i]<0) {
	    		System.out.println(vet[i]);
	    	}
	    }
	    
	    entrada.close();
	}

}
