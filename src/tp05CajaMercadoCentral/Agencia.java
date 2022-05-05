package tp05CajaMercadoCentral;

import java.util.List;

public interface Agencia {
	
	public void registrarPago(Factura factura);
	
	public List<Factura> getListaDeFactura();
}
