package oop01;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Lucas");
		pessoa01.setIdade(30);
		pessoa01.setAltura(1.71);
		pessoa01.setPeso(70);
		pessoa01.setSexo("Masc");
		System.out.println( pessoa01.toString() );
		
		Pessoa pessoa02 = new Pessoa("Adailta", 27, 1.99, 96, "Fmea");
		System.out.println( pessoa02.toString() );
	}
}
