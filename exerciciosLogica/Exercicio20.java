/* 
	20. Escreva um programa que leia um valor real correspondente a uma medida em metros, convertendo o valor dado em pés
	(1 metro = 3.315 pés), exibindo os valores dado e convertido. Caso o usuário forneça um valor negativo, deve ser exibida
	uma mensagem e a operação de conversão não deve ser efetuada.
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
				System.out.print("A operação de conversão não pode ser efetuada. ");
			}else {
				System.out.println("O valor em pés será "+ pes);
			}
		}
	}