package codebeers.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticuloTest {

    @Test
    void testId() {
        Articulo articulo = new Articulo();
        articulo.setId("12A");
        String esperado = "12A";
        String real = articulo.getId();
        assertEquals(esperado, real);
    }

    @Test
    void testDescripcion() {
        Articulo articulo = new Articulo();
        articulo.setDescripcion("Descripcion test");
        String esperado = "Descripcion test";
        String real = articulo.getDescripcion();
        assertEquals(esperado, real);
    }

    @Test
    void testPvp() {
        Articulo articulo = new Articulo();
        articulo.setPvp(30.0f);
        float esperado = 30.0f;
        float real = articulo.getPvp();
        assertEquals(esperado, real);
    }

    @Test
    void testGetGastosEnvio() {
        Articulo articulo = new Articulo();
        articulo.setGastosEnvio(10.0f);
        float esperado = 10.0f;
        float real = articulo.getGastosEnvio();
        assertEquals(esperado, real);
    }

    @Test
    void testPreparacion() {
        Articulo articulo = new Articulo();
        articulo.setGastosEnvio(10.0f);
        float esperado = 10.0f;
        float real = articulo.getGastosEnvio();
        assertEquals(esperado, real);
    }
}