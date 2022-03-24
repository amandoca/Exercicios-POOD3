package oop01;

public class Veiculos {
	
	private String 	modelo;
	private int   	ano;
	private double 	km;
	private double 	preco;
	private String  marca;
	private String 	cor;
	
	public Veiculos(){
		
	}
	
	public Veiculos(String modelo, int ano, double km, double preco, String marca, String cor) {
		this.setModelo(modelo);
		this.setAno(ano);
		this.setKm(km);
		this.setPreco(preco);
		this.setMarca(marca);
		this.setCor(cor);
	}
	
	@Override
	public String toString() {
		return ( this.getModelo()   + ", "+
				 this.getAno()  + ", "+
				 this.getKm() + ", "+
				 this.getPreco()   + ", "+
				 this.getMarca()  + ", "+ 
				 this.getCor()
				);
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKm() {
		return this.km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
