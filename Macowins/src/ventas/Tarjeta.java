package ventas;

public class Tarjeta implements FormaDePago {
	float coeficiente = 1;
	
	public float cobrarTotal(float precioPrendas, int numeroDeCuotas) {
		return numeroDeCuotas * coeficiente + 0.01f * precioPrendas;
	}

	public void cambiarCoeficiente(float nuevoCoeficiente) {
		coeficiente = nuevoCoeficiente;
	}
}
