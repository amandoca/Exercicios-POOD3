/*
	11. Escreva um programa que leia dois n�meros inteiros A e B quaisquer indicando
	se A � m�ltiplo de B ou se B � m�ltiplo de A.
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
			System.out.println("O valor: "+ numA + " � m�ltiplo de "+numB);
		}else {
			System.out.println("O valor: "+ numA + " N�O � m�ltiplo de "+numB);
		}
		if (numB%numA==0){
			System.out.println("O valor: "+ numB + " � m�ltiplo de "+numA);
		}else {
			System.out.println("O valor: "+ numB + " N�O � m�ltiplo de "+numA);
		}
	}

}
