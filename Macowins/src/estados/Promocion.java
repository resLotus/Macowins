package estados;

public class Promocion implements Estado{
	double descuento = 0;
	
	public double precioFinal(double precioPropioDeLaPrenda) {
		return precioPropioDeLaPrenda - descuento;
	};
	
	public void cambiarDescuento(double nuevoDescuento) {
		descuento = nuevoDescuento;
	}
}
