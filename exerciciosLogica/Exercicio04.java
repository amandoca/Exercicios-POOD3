/*
4. Leia um número qualquer fornecido pelo usuário. Determine se o número é maior
do que 100, imprimindo uma mensagem indicando que o "valor é maior que 100"
ou uma mensagem indicando que o "valor é menor ou igual a 100".
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio04 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor < 100){
			System.out.println("O valor lido " + valor + " eh menor que 100!");
		}else {
			System.out.println("O valor lido " + valor + " eh maior ou igual a 100!");
		}
	}
}
