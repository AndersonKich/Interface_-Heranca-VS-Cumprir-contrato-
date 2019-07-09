package model.entidades;

import model.enums.Cores;

public class Circulo extends Figura {

	private double raio;

	public Circulo(Cores cor, double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public double area() {
		
		return 2*3.14*raio;
		
	}
	
	
	
	
}
