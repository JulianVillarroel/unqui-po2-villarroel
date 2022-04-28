package tp04ImpuestoEj3;

import java.time.Month;

public class Ingreso {

	private Integer montoPercibido;
	private Month mesDePercepcion;
	private String concepto;

	public Ingreso(Month mesDePercepcion, String concepto, Integer montoPercibido) {
		this.mesDePercepcion = mes;
		this.concepto = concepto;
		this.montoPercibido = monto;
	}
	
	public Month getMesDePercepcion() {
		return mesDePercepcion;
	}
	
	public String getConcepto() {
		return concepto;
	}
	
	public Integer getMontoPercibido() {
		return monto;
	}
	
}
