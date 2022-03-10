/*
	13. Dados 3 valores reais representando os lados de um possível triângulo, verifique se os mesmos formam um triângulo (a
	medida de qualquer um de seus lados deve ser menor que a soma das medidas dos lados restantes). Caso seja formado um
	triângulo, descubra também se este triângulo é escaleno (três lados diferentes), isósceles (dois lados iguais) ou eqüilátero
	(três lados iguais). 
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
				triangulo = "equilátero";
			}
			if((a==b)!= (b==c)!=(c==a)) {
				triangulo = "escaleno";
			}
			else {
				triangulo = "isósceles";
			}
			System.out.print("O conjuto de medição pode formar o triângulo: " + triangulo);
			
		}else {
			System.out.print("O conjunto de medição NÃO pode formar um triângulo.");
		
		}
	}
}
