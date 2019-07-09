package model.entidades;

import model.enums.Cores;

public class Retangulo extends Figura {

	private double altura;
	private double largura;
	
	
	public Retangulo(Cores cor, double altura, double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}
	
	
	
	
	
	public double getAltura() {
		return altura;
	}





	public void setAltura(double altura) {
		this.altura = altura;
	}





	public double getLargura() {
		return largura;
	}





	public void setLargura(double largura) {
		this.largura = largura;
	}





	public double area() {
		
		return altura * largura;
		
	}
	
	
}