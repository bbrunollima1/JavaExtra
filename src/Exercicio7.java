import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
	    int x = entrada.nextInt();
	    int y = entrada.nextInt();
	    int max;
	    int min;
	    
	    if (x<y) {
	    	min=x;
	    	max=y;
	    }
	    
	    else {
	    	min=y;
	    	max=x;
	    }
	    
	    int soma = 0;
	    for( int i = min+1; i< max ; i++) {
	    	if ( i % 2 !=0) {
	    		soma =soma +i;
	    		
	    	}
	    }
	    System.out.println(soma);
	    
	    entrada.close();
	}

}
