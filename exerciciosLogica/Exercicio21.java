/*
	21 - Fa�a um algoritmo que, lendo 3 n�meros correspondentes aos coeficientes a, b, e c de uma equa��o do 2� grau, calcule
	seu DELTA e tamb�m as ra�zes desta equa��o, imprimindo seus valores.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio21 {
	
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um n�mero inteiro: ");
		int A = input.nextInt();
		System.out.print("Insira um n�mero inteiro: ");
		int B = input.nextInt();
		System.out.print("Insira um n�mero inteiro: ");
		int C = input.nextInt();
		
		int delta = B*B - 4*A*C; 
		System.out.print("Delta igual a "+delta);
	}
}
