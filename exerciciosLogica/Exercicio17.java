/* 	17. Escreva um programa que leia um valor inteiro correspondente a uma quantidade de segundos, convertendo o valor dado
	em horas corridas sabendo que 3600 segundos equivalem a 1 hora, exibindo os valores dado e convertido. Caso o
	usu�rio forne�a um valor negativo, deve ser exibida uma mensagem e a opera��o de convers�o n�o deve ser efetuada.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio17 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o valor: ");
		float seg = input.nextFloat();
		
		float hora = seg/3600;
		
		System.out.println("total de "+hora+" Horas");		
	}
}
