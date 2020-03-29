package prendas;

import estados.Estado;

public class Saco extends Prenda{
	public Saco(float precioPropio, Estado estado) {
		super(precioPropio, estado);
	}
	
	public String tipo() {
		return "saco";
	}
}
