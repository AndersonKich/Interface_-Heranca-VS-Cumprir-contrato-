package aplicacao;

import java.util.Locale;

import model.entidades.AbstractFigura;
import model.entidades.Circulo;
import model.entidades.Retangulo;
import model.enums.Cores;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstractFigura r = new Retangulo(Cores.BLACK, 3.0, 4.0);
		AbstractFigura c = new Circulo(Cores.WHITH, 2.0);
		
		System.out.println("Retangulo cor: "+r.getCor());
		System.out.println("Retangulo area: "+String.format("%.3f",r.area()));
		System.out.println("Circulo cor: "+c.getCor());
		System.out.println("Cirulo area: "+String.format("%.3f",c.area()));
		
		
		
	}

}
