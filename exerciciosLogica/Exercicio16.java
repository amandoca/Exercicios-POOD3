/*
	16. Preparar um programa para ler as medidas da base e da altura de um tri�ngulo, calculando e imprimindo sua �rea,
	sabendo que o c�lculo da �rea � dado por:
	area = (base*altura)/2
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio16 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a base: ");
		float base = input.nextFloat();
		
		System.out.print("Insira a altura: ");
		float altura = input.nextFloat();
		
		float area = (base*altura)/2;
		
		System.out.print("A �rea do tri�ngulo ser� igual a: "+area);
	}
}