package tp06BancoYPrestamos;

public interface Solicitud {
	
	public Boolean realizarChequeo();
	public Double getMontoSolicitado();
	public Cliente getCliente();
}
