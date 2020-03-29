package prendas;

import estados.Estado;

public class Pantalon extends Prenda{
	public Pantalon(float precioPropio, Estado estado) {
		super(precioPropio, estado);
	}
	
	public String tipo() {
		return "pantalon";
	}
}
