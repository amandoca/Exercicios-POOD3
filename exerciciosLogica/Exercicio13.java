/*
	13. Dados 3 valores reais representando os lados de um poss�vel tri�ngulo, verifique se os mesmos formam um tri�ngulo (a
	medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
	tri�ngulo, descubra tamb�m se este tri�ngulo � escaleno (tr�s lados diferentes), is�sceles (dois lados iguais) ou eq�il�tero
	(tr�s lados iguais). 
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio13 {
	public void run() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o valor A: ");
		float a = input.nextFloat();
		
		System.out.print("Insira o valor B: ");
		float b = input.nextFloat();
		
		System.out.print("Insira o valor C: ");
		float c = input.nextFloat();
		
		if( a < b+c && b < a+c && c < a+b) {
			String triangulo;
			
			if((a==b)&& (b==c)&&(c==a)) {
				triangulo = "equil�tero";
			}
			if((a==b)!= (b==c)!=(c==a)) {
				triangulo = "escaleno";
			}
			else {
				triangulo = "is�sceles";
			}
			System.out.print("O conjuto de medi��o pode formar o tri�ngulo: " + triangulo);
			
		}else {
			System.out.print("O conjunto de medi��o N�O pode formar um tri�ngulo.");
		
		}
	}
}
