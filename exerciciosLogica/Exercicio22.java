/*
	22. Considerando um objeto m�vel em movimento uniformemente variado, escreva um programa que receba as seguintes
	informa��es: um valor real indicando posi��o inicial do m�vel P0, um valor real que corresponde a velocidade do m�vel
	V, um outro valor real A correspondente a acelera��o do m�vel e um n�mero inteiro correspondente ao tempo decorrido
	T. O programa deve calcular a posi��o final PF do m�vel, dado pela rela��o abaixo:
	PF = P0 + V * T + (A * T2 ) / 2
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio22 {

	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um n�mero real para a posi��o inicial: \n");
		float P0 = input.nextFloat();
		System.out.print("Insira o n�mero da velocidade desse objeto: \n");
		float V = input.nextFloat();
		System.out.print("Isira a velocidade de acelera��o desse objeto: \n");
		float A = input.nextFloat();
		System.out.print("Insira o tempo decorrido em segundos: \n");
		int T = input.nextInt();
		
		float PF = P0 + V * T + (A * (T^2)) / 2;
		
		System.out.print("Posi��o final do objeto: "+ PF);

	}
}
