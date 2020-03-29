package prendas;

import estados.Estado;

public class Camisa extends Prenda{
	public Camisa(float precioPropio, Estado estado) {
		super(precioPropio, estado);
	}
	
	public String tipo() {
		return "camisa";
	}
}
