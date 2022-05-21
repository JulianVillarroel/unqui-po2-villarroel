package tp08ObserverPublicaciones;

public class ReferenciaTitulo extends ReferenciaNombre {

	public ReferenciaTitulo(String titulo) {
		super(titulo);
	}

	protected String getCampo(Articulo articulo) {

		return articulo.getTitulo();
	}
}
