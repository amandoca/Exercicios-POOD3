package oop01;

public class TesteVeiculo {
	
	public static void main(String[] args) {

	Veiculos carro01 = new Veiculos();
	carro01.setModelo("Fox");
	carro01.setAno(2020);
	carro01.setKm(0);
	carro01.setPreco(80000);
	carro01.setMarca("Azul");
	carro01.setCor("Prata");
	System.out.println( carro01.toString() );
	
	Veiculos carro02 = new Veiculos("Celta", 2010, 40000, 15000, "Chevrolet", "Prata");
	System.out.println( carro02.toString() );
	}
}
