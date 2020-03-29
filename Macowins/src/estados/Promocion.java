package estados;

public class Promocion implements Estado{
	float descuento = 0;
	
	public float precioEstado(float precioPropioDeLaPrenda) {
		return -descuento;
	};
	
	public void cambiarDescuento(float nuevoDescuento) {
		descuento = nuevoDescuento;
	}
}
