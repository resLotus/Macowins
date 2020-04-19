package mePongo;

public class TipoDePrenda {
	Categoria categoria;

	static final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
	static final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
	static final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);
	
	TipoDePrenda(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
}

enum Categoria {
	CALZADO, PARTE_SUPERIOR, PARTE_INFERIOR, ACCESORIO
}
