package ventas;

import prendas.Prenda;
import java.util.List;
import java.util.Date;

public class Venta {
	List<Prenda> prendasEnVenta;
	Date fechaDeLaVenta;
	FormaDePago formaDePago;
	int numeroDeCuotas;
	RegistroVentas registroVentas;
	
	public Venta(Date fechaDeLaVenta, FormaDePago formaDePago, int numeroDeCuotas) {
		this.fechaDeLaVenta = fechaDeLaVenta;
		this.formaDePago = formaDePago;
		this.numeroDeCuotas = numeroDeCuotas;		
	}
	
	void agregarPrendaAVenta(Prenda prenda) {
		prendasEnVenta.add(prenda);
	}
	
	float precioPrendas() {
		return prendasEnVenta.stream().map(prenda -> prenda.precioFinal()).reduce(0.0f, (a, b) -> a + b);
	}
	
	long cantidadDePrendas() {
		return prendasEnVenta.stream().count();
	}
	
	float cobrarTotal() {
		registroVentas.agregarVenta(this);
		return formaDePago.cobrarTotal(this.precioPrendas(), numeroDeCuotas);
	}
	
	Date fecha() {return fechaDeLaVenta;}
}
