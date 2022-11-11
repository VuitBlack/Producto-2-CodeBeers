package codebeers.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class PedidoTest {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    @Test
    void testGetNum() {
        Pedido pedido = new Pedido();

        pedido.getNum();
        int esperado = 1;
        int real = pedido.getNum();
        assertEquals(esperado, real);
    }

    @Test
    void testSetNum() {
        Pedido pedido = new Pedido();

        pedido.setNum(1234);
        int esperado = 1234;
        int real = pedido.getNum();
        assertEquals(esperado, real);
    }

    @Test
    void testGetCantidad() {
        Pedido pedido = new Pedido();

        pedido.getCantidad();
        int esperado = 0;
        int real = pedido.getCantidad();
        assertEquals(esperado, real);
    }

    @Test
    void testSetCantidad() {
        Pedido pedido = new Pedido();

        pedido.setCantidad(4);
        int esperado = 4;
        int real = pedido.getCantidad();
        assertEquals(esperado, real);
    }

    @Test
    void pedidoEnviado() {
    }

    @Test
    void precioEnvio() {
    }

    @Test
    void getTotal() {
    }
}