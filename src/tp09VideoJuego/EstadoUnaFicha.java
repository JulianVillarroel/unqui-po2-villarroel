package tp09VideoJuego;

public class EstadoUnaFicha implements EstadoDelJuego {

	@Override
	public void botonInicio(VideoJuego juego) {
		juego.setEstado(new EstadoUnJugador());

	}

	@Override
	public void ingresarFicha(VideoJuego juego) {
		juego.setEstado(new EstadoDosFichas());

	}
}
