package tp08CompositeCultivo;

public class Soja implements Cultivo {

	@Override
	public Double gananciaAnual() {

		return 500d;
	}

	@Override
	public Double calcularGananciaAnual() {

		return this.gananciaAnual() / 4;
	}
}
