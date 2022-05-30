package tp08ObserverConcurso;

public interface EstadoDeParticipante {
	
	void recibirNotificacion(String notificacion, Participante participante);

	void enviarRespuesta(String respuesta, Partida servidor, Participante participante);
}
