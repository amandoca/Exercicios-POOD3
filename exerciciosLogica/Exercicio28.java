/*
	28. Faça um programa que exiba a tabela verdade da operação E-Lógico para todas as combinações de três variáveis lógicas
	A, B e C. Os resultados da tabela devem ser exibidos como F ou V.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio28 {

	public void run() {
		Scanner input = new Scanner(System.in);
		
		for (int a= 0; a<=1; a++){
			for (int b= 0; b<=1; b++){
				for (int c= 0; c<=1; c++){
					System.out.print(a + " E "+ c + " E "+ c + " = " + (a==1 && b==1 && c==1) != null?"Verdadeiro":"Falso");
				}
			}
		}
	}
}

