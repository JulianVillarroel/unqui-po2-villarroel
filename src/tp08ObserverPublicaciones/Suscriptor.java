package tp08ObserverPublicaciones;

import java.util.List;

public interface Suscriptor {

	public void recibirArticulo(Articulo articulo);

	List<IReferencia> getReferencias();
}
