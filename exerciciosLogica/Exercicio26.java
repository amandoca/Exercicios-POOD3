/* 
	26. Escreva um programa que calcule a soma de N números quaisquer fornecidos pelo usuário. O programa deve parar de ler
	e, portanto somar os valores quando for introduzido o número 0 (zero).
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio26 {
	public void run() {
		int soma =0;
		int valor;
		do {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um número inteiro ou [0] para finalizar: ");
		valor = input.nextInt();
		soma = soma+valor;
		
		}while(valor != 0);
		System.out.println("Resultado total: "+soma);

		
	}
}
