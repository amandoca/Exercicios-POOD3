/*
3. Leia um n�mero qualquer fornecido pelo usu�rio. Determine se o n�mero � maior do que 50,
imprimindo uma mensagem indicando tal fato.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio03 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		if ( valor > 50){
			System.out.println("O valor lido " + valor + " eh maior que 50!");
		}
	}
}
