/* 
	20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em p�s
	(1 metro = 3.315 p�s), exibindo os valores dado e convertido. Caso o usu�rio forne�a um valor negativo, deve ser exibida
	uma mensagem e a opera��o de convers�o n�o deve ser efetuada.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio20 {
		public void run() {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Insira um valor: ");
			float a = input.nextFloat();
			
			float pes = a /3315;
			
			if(a < 0) {
				System.out.print("A opera��o de convers�o n�o pode ser efetuada. ");
			}else {
				System.out.println("O valor em p�s ser� "+ pes);
			}
		}
	}