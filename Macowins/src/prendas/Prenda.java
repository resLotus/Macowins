package prendas;

import estados.Estado;

public class Prenda {
	double precioPropio;
	Estado estado;
	Tipo tipo;
	
	public Prenda(double precioPropio, Estado estado, Tipo tipo) {
		this.precioPropio = precioPropio;
		this.estado = estado;
		this.tipo = tipo;
	}
	
	public double precioFinal() {
		return estado.precioFinal(precioPropio);
	}
	
	public Tipo tipo() {
		return tipo;
	};
}
