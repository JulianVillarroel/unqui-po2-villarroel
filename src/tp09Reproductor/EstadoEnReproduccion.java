package tp09Reproductor;

import java.io.IOException;

public class EstadoEnReproduccion implements Estado {

	@Override
	public void play(Song song, Reproductor musica) throws IOException {
		throw new IOException("accion incorrecta");

	}

	@Override
	public void pause(Song song, Reproductor musica) {
		song.pause();
		musica.setEstado(new EstadoPausada());

	}

	@Override
	public void stop(Song song, Reproductor musica) {
		song.stop();
		musica.setEstado(new EstadoSeleccion());

	}

	@Override
	public String getEstado() {
		return "En Reproduccion";
	}

}
