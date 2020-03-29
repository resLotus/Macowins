package ventas;

import java.util.List;
import java.util.Date;

public class RegistroVentas {
	List<Venta> listaDeVentasCobradas;
	
	public void agregarVenta(Venta venta) {
		listaDeVentasCobradas.add(venta);
	}
	
	public float gananciasDelDia(Date fecha) {
		return listaDeVentasCobradas.stream().filter(venta -> venta.fecha() == fecha).map(venta -> venta.cobrarTotal()).reduce(0.0f, (a, b) -> a + b);
	}
}
