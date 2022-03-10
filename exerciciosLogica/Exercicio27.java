/*
	27. Calcule a média de Notas de alunos. O programa deve parar de ler valores quando for fornecido um valor negativo como
	nota.
*/


package exerciciosLogica;
import java.util.Scanner;

public class Exercicio27 {
	
	public void run() {
		float n=0, media=0, notas=0,c=0;

		Scanner input = new Scanner(System.in);
		
		do {
		System.out.print("Insira a nota do aluno ou valor negativo -1 para fechar: ");
		n = input.nextFloat();
		c++;
		
		if(n >= 0) {
			notas = n+notas;
		}
		
		}while(n >= 0);
		
		media = (notas/(c-1));
		
		System.out.print("Resultado: "+media);
		System.out.print("\nDividido por: "+(c-1));

	}
}
