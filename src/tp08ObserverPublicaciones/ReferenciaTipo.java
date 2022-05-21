package tp08ObserverPublicaciones;

public class ReferenciaTipo extends ReferenciaNombre{
	
	public ReferenciaTipo(String referencia) {
		super(referencia);
	}
	
	@Override
	protected String getCampo(Articulo articulo) {
		return articulo.getTipo();
	}
}
