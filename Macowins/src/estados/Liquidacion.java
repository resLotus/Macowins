package estados;

public class Liquidacion implements Estado{
	public float precioEstado(float precioPropioDeLaPrenda) {
		return -(precioPropioDeLaPrenda * 0.5f);
	};
}
