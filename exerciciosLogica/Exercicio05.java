/*
5. 	Dado um n�mero inteiro qualquer, fornecido pelo usu�rio, descobrir se o mesmo � par ou �mpar.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio05 {
	public void run() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		int valor = input.nextInt();
		if ( (valor % 2) == 0 ) {
			System.out.println("O valor lido " + valor + "  � par! ");
		} else {
			System.out.println("O valor lido " + valor + "  � impar! ");
		}
		
		
	}
}
