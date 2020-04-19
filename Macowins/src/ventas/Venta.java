package ventas;

import java.util.List;
import java.util.Date;

public class Venta {
	List<Item> items;
	Date fechaDeLaVenta;
	int numeroDeCuotas;
	RegistroVentas registroVentas;
	
	public Venta(Date fechaDeLaVenta, int numeroDeCuotas) {
		this.fechaDeLaVenta = fechaDeLaVenta;
		this.numeroDeCuotas = numeroDeCuotas;		
	}
	
	int cantidadDePrendas() {
		return items.stream().map(item -> item.getCantidad()).reduce(0, (a, b) -> a + b);
	}
	
	public double importe() {
		return items.stream().map(item -> item.importe()).reduce(0.0, (a, b) -> a + b);
	}
	
	Date fecha() {return fechaDeLaVenta;}
}
