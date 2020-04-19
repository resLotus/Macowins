package estados;

public class Liquidacion implements Estado{
	public double precioFinal(double precioPropioDeLaPrenda) {
		return precioPropioDeLaPrenda * 0.5f;
	};
}
