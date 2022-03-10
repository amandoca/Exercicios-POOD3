/*
	24. Implementar três programas para exibir a tabuada de um número inteiro entre 1 e 20 dado pelo usuário.
	a) Usando enquanto (while)
	b) Usando faça-enquanto (do-while)
	c) Usando para (for)
 **Obs. Caso o valor dado seja inválido o programa deve apenas exibir uma mensagem de aviso.**
*/

package exerciciosLogica;
import java.util.Scanner;

public class Exercicio24 {
	public void run() {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um valor inteiro entre 1 e 20: ");
		int num = input.nextInt();
		int a = 1;
		
		if((num < 20) && (num > 0) ) {
			System.out.println("");
			
			for(a = 1; a <=10; a++) {
				System.out.println(num+" X "+ a+": "+(num*a));
			}
			
			a=1;
			System.out.println("");
	
			while( a <= 10) {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}
			
			a=1;
			System.out.println("");
	
			do {
				System.out.println(num+" X "+ a+": "+(num*a));
				a++;
			}while(a <= 10);
		}else {
			System.out.println("Sem êxito");
		}
	}
}
