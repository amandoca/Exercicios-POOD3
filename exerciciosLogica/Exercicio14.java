/* 
	14. Escreva um programa que leia 3 notas (valores reais), calculando e exibindo sua média aritmética.
	Imprima também "Aprovado" se a média for maior que 7, "Reprovado" se for menor que 3 e "Exame"
	se estiver entre 3 e 7. 
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio14 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira a primeira nota: ");
		float a = input.nextFloat();
		System.out.print("Insira a segunda nota: ");
		float b = input.nextFloat();
		System.out.print("Insira a terceira nota: ");
		float c = input.nextFloat();
		
		float media;
		media = (a + b + c) / 3; 
		
		if(media>7){
			System.out.println("Nota: "+ media);
			System.out.println("O Aluno foi Aprovado!");
		}
		 else if(media>3 && media<7) {
			System.out.println("Nota: "+ media);
			System.out.println("O Aluno Está de Exame!");
		}
		else if(media<3) {
			System.out.println("Nota: "+ media);
			System.out.println("Reprovado!");
		}
		
		
	}
}
