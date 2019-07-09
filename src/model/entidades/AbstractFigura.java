package model.entidades;

import model.enums.Cores;

public abstract class AbstractFigura implements Figura {
	
	private Cores cor;
	
	public AbstractFigura(Cores cor) {
		this.cor = cor;
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

	


	
	
	
	
	
}
