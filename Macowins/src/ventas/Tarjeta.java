package ventas;

import java.util.Date;

public class Tarjeta extends Venta {
	double coeficiente = 1;
	
	public Tarjeta(Date fechaDeLaVenta, int numeroDeCuotas) {
		super(fechaDeLaVenta, numeroDeCuotas);
	}
	
	@Override
	public double importe() {
		return numeroDeCuotas * coeficiente + 0.01 * super.importe() + super.importe();
	}

	public void cambiarCoeficiente(double nuevoCoeficiente) {
		coeficiente = nuevoCoeficiente;
	}
}
