/*
	29. Fa�a um programa que exiba a tabela verdade da opera��o OU-L�gico para todas as combina��es de tr�s vari�veis
	l�gicas A, B e C. Os resultados da tabela devem ser exibidos como F ou V.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio29 {

		public void run() {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Insira um n�mero para valor A: ");
			int a = input.nextInt();
			System.out.print("Insira um n�mero para valor B: ");
			int b = input.nextInt();
			System.out.print("Insira um n�mero para valor C: ");
			int c = input.nextInt();
			
			int menor = ((int) (Math.pow(2, 32)/2)-1 );
			
			menor = (((a<b) && (a<c)) ? a : menor );
			menor = (((b<a) && (b<c)) ? b : menor );
			menor = (((c<a) && (c<b)) ? c : menor );
			
			System.out.print("Menor valor inserido " + menor );
		}
}
