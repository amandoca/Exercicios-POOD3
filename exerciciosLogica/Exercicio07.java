/*
7.  Escreva um programa que leia dois valores, os quais denominaremos A e B, fornecidos pelo usu�rio, exibindo respostas
F ou V para as seguintes quest�es:
(a) A � igual a zero?
(b) B � menor que zero; e
(c) A OU B s�o maiores do que zero?
Use operadores l�gicos para formular as express�es necess�rias a avalia��o dos valores.
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio07 {
	
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor para A: ");
		float a = input.nextFloat();
		System.out.print("Digite um valor para B: ");
		float b = input.nextFloat();
		
		System.out.println(" a) A � igual a zero? " + ((a == 0) ? "verdadeiro" : "falso"));
		System.out.println(" b) B � menor que zero?"  + ((b > 0) ? "verdadeiro" : "falso"));
		System.out.println(" c) A OU B s�o maiores do que zero?" + (((a >0)||(b >0)) ? "verdadeiro" : "falso"));
	}
}
