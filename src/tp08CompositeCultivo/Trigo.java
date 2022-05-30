package tp08CompositeCultivo;

public class Trigo implements Cultivo {

	@Override
	public Double gananciaAnual() {
		return 300d;
	}

	@Override
	public Double calcularGananciaAnual() {

		return this.gananciaAnual() / 4;
	}
}
