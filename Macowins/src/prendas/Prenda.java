package prendas;

import estados.Estado;

public abstract class Prenda {
	float precioPropio;
	Estado estado;
	
	public Prenda(float precioPropio, Estado estado) {
		this.precioPropio = precioPropio;
		this.estado = estado;
	}
	
	public float precioFinal() {
		return precioPropio + estado.precioEstado(precioPropio);
	}
	
	abstract public String tipo();
}
