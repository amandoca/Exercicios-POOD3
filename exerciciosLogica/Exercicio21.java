/*
	21 - Faça um algoritmo que, lendo 3 números correspondentes aos coeficientes a, b, e c de uma equação do 2º grau, calcule
	seu DELTA e também as raízes desta equação, imprimindo seus valores.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio21 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um número inteiro: ");
		int A = input.nextInt();
		System.out.print("Insira um número inteiro: ");
		int B = input.nextInt();
		System.out.print("Insira um número inteiro: ");
		int C = input.nextInt();
		
		int delta = B*B - 4*A*C; 
		System.out.print("Delta igual a "+delta);
	}
}
