import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner entrada = new Scanner(System.in);
			
	     int N = entrada.nextInt();
	     
	     for(int i = 0 ; i<=10; i++) {
	    	 int produto = i * N;
	    	 
	    	 System.out.println(i + " x " + N + " = " + produto);
	     }
	     
	     entrada.close();
	}

}
