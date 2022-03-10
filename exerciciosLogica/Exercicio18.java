/*
	18. Escreva um programa que leia um número inteiro entre 0 e 100 e o exiba por extenso, por exemplos:
	16 -> "dezesseis",
	34 -> "trinta e quatro", etc..
*/

package exerciciosLogica;

import java.util.Scanner;

public class Exercicio18 {
	
	 String Numeros[][] = {  
	          {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez",  
	          "Onze", "Doze", "Treze", "Quatorze", "Quinze", "Desesseis", "Desessete", "Dezoito", "Desenove"},  
	          {"Vinte", "Trinta", "Quarenta", "Cinquenta", "Sessenta", "Setenta", "Oitenta", "Noventa"},  
	          {"Cem", "Cento", "Duzentos", "Trezentos", "Quatrocentos", "Quinhentos", "Seiscentos",  
	          "Setecentos", "Oitocentos", "Novecentos"}  
	 };  

	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro entre 0 e 100: ");
		int a = input.nextInt();
	}
}
