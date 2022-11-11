package codebeers.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EstandarTest {

    @Test
    void testEmailClienteEstandar() {
        Estandar estandar = new Estandar() {
        };
        estandar.setEmail("ClienteEstandar@mail.com");
        String esperado = "ClienteEstandar@mail.com";
        String real = estandar.getEmail();
        Assertions.assertEquals(esperado, real);
    }
}