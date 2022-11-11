package codebeers.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    void testNombreCliente() {
        Cliente cliente = new Cliente() {
            @Override
            public String tipoCliente() {
                return null;
            }

            @Override
            public float calcAnual() {
                return 0;
            }

            @Override
            public float descuentoEnv() {
                return 0;
            }
        };
        cliente.setNombre("Albert Einstein");
        String esperado = "Albert Einstein";
        String real = cliente.getNombre();
        Assertions.assertEquals(esperado, real);
    }

    @Test
    void nifClienteTest () {
        Cliente cliente = new Cliente() {
            @Override
            public String tipoCliente() {
                return null;
            }

            @Override
            public float calcAnual() {
                return 0;
            }

            @Override
            public float descuentoEnv() {
                return 0;
            }
        };
        cliente.setNif("123456789A");
        String esperado = "123456789A";
        String real = cliente.getNif();
        Assertions.assertEquals(esperado, real);
    }

    @Test
    void emailTest() {
        Cliente cliente = new Cliente() {
            @Override
            public String tipoCliente() {
                return null;
            }

            @Override
            public float calcAnual() {
                return 0;
            }

            @Override
            public float descuentoEnv() {
                return 0;
            }
        };
        cliente.setEmail("albert@einstein.com");
        String esperado = "albert@einstein.com";
        String real = cliente.getEmail();
        Assertions.assertEquals(esperado, real);
    }
}
