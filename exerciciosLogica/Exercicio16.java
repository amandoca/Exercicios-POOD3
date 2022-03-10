/*
	16. Preparar um programa para ler as medidas da base e da altura de um triângulo, calculando e imprimindo sua área,
	sabendo que o cálculo da área é dado por:
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
		
		System.out.print("A área do triângulo será igual a: "+area);
	}
}