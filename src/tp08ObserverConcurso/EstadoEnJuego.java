package tp08ObserverConcurso;

public class EstadoEnJuego implements EstadoDeParticipante {

	@Override
	public void recibirNotificacion(String notificacion, Participante participante) {
		if (notificacion.contains("gano la partida")) {
			participante.setEstado(new EstadoFueraDeJuego());
		}
		
	}

	@Override
	public void enviarRespuesta(String respuesta, Partida servidor, Participante participante) {
		servidor.verificarRespuesta(participante, participante.getPreguntas().get(0) , respuesta);
		
	}
}
