/*
2. 	Escreva um programa que leia um n�mero real fornecido pelo usu�rio, 
	armazenando-o numa vari�vel apropriada.
	Imprima o valor lido.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio02 {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um valor real: ");
		float valor = input.nextFloat();
		System.out.println("O valor lido foi: " + valor);		
	}
}
