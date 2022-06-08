package tp10RefactoringAutomotor;

import java.time.LocalDate;

public class Vehiculo {
	private Boolean esVehiculoPolicial;
	private LocalDate fechaFabricacion;
	private String ciudadRadicacion;

	public Vehiculo(Boolean esVehiculoPolicial, LocalDate fechaFabricacion, String ciudadRadicacion) {
		this.esVehiculoPolicial = esVehiculoPolicial;
		this.fechaFabricacion = fechaFabricacion;
		this.ciudadRadicacion = ciudadRadicacion;
	}

	public Boolean esVehiculoPolicial() {
		return esVehiculoPolicial;
	}

	public LocalDate getFechaFabricacion() {
		return fechaFabricacion;
	}

	public String ciudadRadicacion() {
		return ciudadRadicacion;
	}

	public boolean realizaVtv(LocalDate fecha) {
		return (this.noEsVehiculoPolicial() && this.tieneMasDeUnAñoDeAntiguedad(fecha) && this.radicadoEnBuenosAires());
	} // Al tener buenos nombres me parece innecesario los comentarios de mas.

	private boolean noEsVehiculoPolicial() {
		return !esVehiculoPolicial;
	}

	private boolean radicadoEnBuenosAires() {
		return ciudadRadicacion.equalsIgnoreCase("Buenos Aires");
	}

	private boolean tieneMasDeUnAñoDeAntiguedad(LocalDate fecha) {
		return fecha.minusYears(1).isAfter(fechaFabricacion);
	}
}
