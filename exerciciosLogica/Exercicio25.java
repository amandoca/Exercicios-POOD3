/*
	25. Faça um programa que calcule a soma de N números quaisquer fornecidos pelo usuário.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio25 {
	public void run() {
		int soma =0;
		int valor;

		Scanner input = new Scanner(System.in);
		System.out.print("Insira um número inteiro : ");
		valor = input.nextInt();
		soma = soma+valor;
		
	}
}
