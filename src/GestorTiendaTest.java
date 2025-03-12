import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {
	static GestorTienda gestor;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 gestor = new GestorTienda();
	}

	@Test
	void testCalcularDescuento() {
		 
		 Double resultado1 = gestor.calcularDescuento(100.0, 10);
	        assertEquals(10.0, resultado1);

	        Double resultado2 = gestor.calcularDescuento(100.0, 5);
	        assertEquals(5.0, resultado2);

	        Double resultado3 = gestor.calcularDescuento(100.0, 1);
	        assertEquals(0.0, resultado3);

	        Double resultado4 = gestor.calcularDescuento(100.0, 10000);
	        assertEquals(10.0, resultado4);
	}

	@Test
	void testCategorizarProducto() {
		 assertEquals("Económico", gestor.categorizarProducto(5.0));
	        assertEquals("Estándar", gestor.categorizarProducto(20.0));
	        assertEquals("Premium", gestor.categorizarProducto(100.0));

	        // Caso límite
	        assertEquals("Económico", gestor.categorizarProducto(9.99));
	        assertEquals("Estándar", gestor.categorizarProducto(49.99));
		
	}

	@Test
	void testBuscarProducto() {
	     String[] inventario = {"smartphone", "camiseta", "ordenador"};

	        assertEquals("smartphone", gestor.buscarProducto(inventario, "smartphone"));
	        assertEquals("camiseta", gestor.buscarProducto(inventario, "camiseta"));
	        assertNull(gestor.buscarProducto(inventario, "tablet"));
	
	}

}
