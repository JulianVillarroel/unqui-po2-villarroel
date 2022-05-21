package tp08ObserverEncuentrosDeportivos;

public class Deporte implements Interes {
	private String tipo;

	public Deporte(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Boolean chequearPartido(Partido partido) {
		return partido.getDeporte().equals(tipo);
	}

}
