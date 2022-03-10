/*
6. Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, exibindo respostas
F ou V para as seguintes quest�es:
(a) A � maior que zero?
(b) B � maior que zero;
(c) A E B s�o maiores do que zero?
Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio06 {

	public void run01() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		if (a >0) {
			System.out.println(" (a) A � maior que zero?  verdadeiro");
		}else{
			System.out.println(" (a) A � maior que zero?  falso");
		}
		
		if (b >0) {
			System.out.println(" (b) B � maior que zero?  verdadeiro");
		}else{
			System.out.println(" (b) B � maior que zero?  falso");
		}
		
		if ( (a >0) && (b > 0)) {
			System.out.println(" (c) A E B s�o maiores do que zero?  verdadeiro");
		}else{
			System.out.println(" (c) A E B s�o maiores do que zero?  falso");
		}
	}
	
	
	public void run02() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" (a) A � maior que zero? " + ((a >0) ? "verdadeiro" : "falso"));
		System.out.println(" (b) B � maior que zero?"  + ((b >0) ? "verdadeiro" : "falso"));
		System.out.println(" (c) A E B s�o maiores do que zero?" + (((a >0)&&(b >0)) ? "verdadeiro" : "falso"));
		
	}
}
