import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entrada = new Scanner(System.in);
		
	     int idade = entrada.nextInt();
	     int soma = 0;
	     int cont = 0;
	     
	   while(idade>=0) {
	     soma = soma + idade;
	     cont++;
	     idade = entrada.nextInt();
	   }
	   
	   if(cont>0) {
		   double media = (double) soma / cont;
		   
		   System.out.printf("%.2f%n", media);
	   }
	   
	   else {
		   System.out.println("Impossível calcular");
	   }
	   
	   entrada.close();
	}
	   

}
