package tp04SupermercadosEj1y2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp04SupermercadoEj1y2.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, null);
		
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
}
