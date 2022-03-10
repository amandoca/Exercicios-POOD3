/*
	11. Escreva um programa que leia dois números inteiros A e B quaisquer indicando
	se A é múltiplo de B ou se B é múltiplo de A.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio11 {
		public void run() {
			
		Scanner input = new Scanner(System.in);		
		System.out.println("Insira o valor A: ");
		int numA = input.nextInt();
		System.out.println("Insira o valor  B: ");
		int numB = input.nextInt();
		
		if (numA%numB==0){
			System.out.println("O valor: "+ numA + " é múltiplo de "+numB);
		}else {
			System.out.println("O valor: "+ numA + " NÃO é múltiplo de "+numB);
		}
		if (numB%numA==0){
			System.out.println("O valor: "+ numB + " é múltiplo de "+numA);
		}else {
			System.out.println("O valor: "+ numB + " NÃO é múltiplo de "+numA);
		}
	}

}
