package tp05CajaMercadoCentral;

public class ProductoDeEmpresaTradicional extends Producto {

	public ProductoDeEmpresaTradicional(Double precio, Integer stock) {
		super(precio, stock);
	}

	@Override
	protected Double getMontoAPagar() {
		return this.getPrecio();
	}
}
