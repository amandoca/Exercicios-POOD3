/*
	22. Considerando um objeto móvel em movimento uniformemente variado, escreva um programa que receba as seguintes
	informações: um valor real indicando posição inicial do móvel P0, um valor real que corresponde a velocidade do móvel
	V, um outro valor real A correspondente a aceleração do móvel e um número inteiro correspondente ao tempo decorrido
	T. O programa deve calcular a posição final PF do móvel, dado pela relação abaixo:
	PF = P0 + V * T + (A * T2 ) / 2
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um número real para a posição inicial: \n");
		float P0 = input.nextFloat();
		System.out.print("Insira o número da velocidade desse objeto: \n");
		float V = input.nextFloat();
		System.out.print("Isira a velocidade de aceleração desse objeto: \n");
		float A = input.nextFloat();
		System.out.print("Insira o tempo decorrido em segundos: \n");
		int T = input.nextInt();
		
		float PF = P0 + V * T + (A * (T^2)) / 2;
		
		System.out.print("Posição final do objeto: "+ PF);

	}
}
