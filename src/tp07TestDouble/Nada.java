package tp07TestDouble;

import java.util.List;

public class Nada extends Jugada {

	@Override
	protected Boolean leGanaATipoDeJugada(Jugada tipoDeJugada) {

		return false;
	}

	@Override
	protected Boolean esJugada(List<Carta> listaDeCartas) {

		return true;

	}

	@Override
	protected String tipoDeJugada() {

		return "Nada";
	}

	@Override
	protected Jugada siguienteJugada() {

		return null;
	}

	@Override
	public Integer getValorDeJugada() {
		return 0;
	}
}
