package tp05CajaMercadoCentral;

public class FacturaDeImpuestos extends Factura{
	
	private Double tasaDelServicio;
	
	
	public FacturaDeImpuestos(Double tasaDelServicio, Agencia agencia) {
		super(agencia);
		this.tasaDelServicio = tasaDelServicio;
	}
	
	
	@Override
	protected Double getMontoAPagar() {
		return this.tasaDelServicio;
	}

}
