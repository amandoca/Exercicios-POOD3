/*
1.  Escreva um programa que leia um número inteiro fornecido pelo usuário, 
	armazenando-o numa variável apropriada.
    Imprima o valor lido.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio01 {
		public void run() {
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
		System.out.println("Valor digitado : "+ num);
	}
}
