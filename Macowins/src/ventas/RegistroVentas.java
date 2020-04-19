package ventas;

import java.util.List;
import java.util.Date;
import java.util.stream.Collectors;

public class RegistroVentas {
	List<Venta> listaDeVentasCobradas;
	
	public void agregarVenta(Venta venta) {
		listaDeVentasCobradas.add(venta);
	}
	
	public double gananciaDelDia(Date fecha) {
		return ventasDelDia(fecha).stream().map(venta -> venta.importe()).reduce(0.0, (a, b) -> a + b);
	}
	
	public List<Venta> ventasDelDia(Date fecha) {
		return listaDeVentasCobradas.stream().filter(venta -> venta.fecha() == fecha).collect(Collectors.toList());
	}
}
