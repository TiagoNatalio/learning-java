package curso_programacao;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double fahre;
		double celsius;
		char repetir;
		
		do{
			
			System.out.print("Digite a temperatura em Celsius:");
			celsius = sc.nextInt();
			
			fahre = (9.0 * celsius) / 5.0 + 32.0;
			
			System.out.printf("Equivalente a Fahrenheit: %.1f%n",fahre);
			System.out.print("Dejesa repetir (s/n)?");
			
			repetir = sc.next().charAt(0);
			
		}while(repetir != 'n');
		
		sc.close();
	}
}