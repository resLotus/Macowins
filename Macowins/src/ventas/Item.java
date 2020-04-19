package ventas;

import prendas.Prenda;

public class Item {
	Prenda prenda;
	int cantidad;
	
	Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double importe() {
		return prenda.precioFinal() * cantidad;
	}
	
	public int getCantidad() {
		return cantidad;
	}
}
