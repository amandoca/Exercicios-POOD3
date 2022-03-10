/*
	30.  Escreva um programa que calcule o valor de y = f(x) = a*x + b num intervalo de valores de x, sendo dados pelo usuário
	os coeficientes a e b, bem como os valores do limite inferior e superior do intervalo de x bem como o valor do incremento
	de x. O programa deve exibir resultados como um tabela onde constam os valores de x e y=f(x) lado a lado.
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio30 {

	public void run() {
	    int x, a, b, y, fx;
	    Scanner input = new Scanner(System.in);
	    System.out.print("Insira o limite superior de X: \n");
	    a = input.nextInt();
	    System.out.print("Insira o limite inferior de X: \n");
	    b = input.nextInt();
	    for(int i= 0; i<10; i++) {
	    	fx = i;
	    	x = a*fx+b;
	    	y = x - fx;
	    System.out.print("\nCoordenadas"+ x+ "-"+y);
	    }
    }
}
