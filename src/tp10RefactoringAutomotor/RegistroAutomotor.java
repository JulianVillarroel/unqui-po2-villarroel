package tp10RefactoringAutomotor;

import java.time.LocalDate;

public class RegistroAutomotor {

	public Boolean debeRealizarVtv(Vehiculo vehiculo, LocalDate fecha) {
		return vehiculo.realizaVtv(fecha);

	}
}
