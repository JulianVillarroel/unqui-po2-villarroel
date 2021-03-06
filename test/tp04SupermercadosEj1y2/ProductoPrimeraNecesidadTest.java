package tp04SupermercadosEj1y2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp04SupermercadoEj1y2.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9);
		arroz = new ProductoPrimeraNecesidad("arroz", 18.9d, false, 0.5);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
		
		assertEquals(9.45d, arroz.getPrecio());
	}
}
