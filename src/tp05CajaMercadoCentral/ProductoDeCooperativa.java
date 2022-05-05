package tp05CajaMercadoCentral;

public class ProductoDeCooperativa extends Producto{
	
	public ProductoDeCooperativa(Double precio, Integer stock) {
		super (precio, stock);
	}
	
	@Override
	protected Double getMontoAPagar() {
		return this.getPrecio() * 0.9;
	}
}
