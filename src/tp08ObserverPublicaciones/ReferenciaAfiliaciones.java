package tp08ObserverPublicaciones;

import java.util.List;

public class ReferenciaAfiliaciones extends ReferenciaLista{

	public ReferenciaAfiliaciones(String referencia) {
		super(referencia);
	
	}

	@Override
	protected List<String> getCampo(Articulo articulo) {

		return articulo.getAfiliaciones();
	}
}
