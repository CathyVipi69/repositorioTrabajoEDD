
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TrabajoTest {
	
	Trabajo t;
	
	@BeforeEach
	void setUp() throws Exception {
		t = new Trabajo();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Comprobar el area del triangulo de forma correcta")
	void testAreaTriangulo() {
		float areaTriangulo = t.areaTriangulo(20, 3);
		assertEquals(30, areaTriangulo);
	}

	@Test
	@DisplayName("Comprobar si se cumple el teorema de Pitágoras de forma erronea")
	void testPitagoras() {
		double teoremaPitagoras = t.pitagoras(5, 4);
		assertNotEquals(424142, teoremaPitagoras);
	}

	@Test
	@DisplayName("Comprobar el tipo de triangulo de forma correcta")
	void testTipoTriangulo() {
		String tipoTriangulo = t.tipoTriangulo(6, 7, 9);
		assertEquals("escaleno", tipoTriangulo);
	}

	@Test
	@DisplayName("Comprobar el aumento de un valor de forma erronea")
	void testAumentoTotal() {
		double aumentoTotal = t.aumentoTotal(60, 5);
		assertNotEquals(560, aumentoTotal);
	}

	@Test
	@DisplayName("Comprobar si el primer numero es mayor de forma correcta")
	void testEsMayor() {
		boolean esMayor = t.esMayor(10, 5);
		assertEquals(true, esMayor);
	}

	
	@Test
	@DisplayName("Sacar un triangulo isosceles de forma correcta")
	void testTipoTriangulo2() {
		String tipoTriangulo = t.tipoTriangulo(7, 7, 9);
		assertEquals("isoceles", tipoTriangulo);
	}
	
	@Test
	@DisplayName("Comprobar el aumento de un valor de forma correcta")
	void testAumentoTotal2() {
		double aumentoTotal = t.aumentoTotal(100, 20);
		assertEquals(120, aumentoTotal);
	}
}
