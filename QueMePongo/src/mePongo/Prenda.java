package mePongo;

import java.util.Objects;

public class Prenda {
	TipoDePrenda tipo;
	Material material;
	Color color;
	Color colorSecundario = null;
	
	
	Prenda(TipoDePrenda tipo, Material material, Color color, Color colorSecundario) {
		this.tipo = Objects.requireNonNull(tipo, "tipo de prenda es obligatorio");
		this.material = Objects.requireNonNull(material, "material es obligatorio");
		this.color = Objects.requireNonNull(color, "color es obligatorio");
		this.colorSecundario = colorSecundario;
	}
}