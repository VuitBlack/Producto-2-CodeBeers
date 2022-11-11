package codebeers.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PremiumTest {

    @Test
    void testNombreClientePremium() {
        Premium premium = new Premium() {
        };
        premium.setNombre("Nombre Cliente Premium");
        String esperado = "Nombre Cliente Premium";
        String real = premium.getNombre();
        Assertions.assertEquals(esperado, real);
    }

    @Test
    void testEmailClientePremium() {
        Premium premium = new Premium() {};
        premium.setEmail("ClientePremium@mail.com");
        String esperado = "ClientePremium@mail.com";
        String real = premium.getEmail();
        Assertions.assertEquals(esperado, real);
    }

    @Test
    void testCalcAnual() {
        //TODO
    }

    @Test
    void setCalcAnual() {
        //TODO
    }

    @Test
    void getDescuentoEnv() {
        //TODO
    }

    @Test
    void setDescuentoEnv() {
        //TODO
    }

    @Test
    void tipoCliente() {
        //TODO
    }

    @Test
    void testToString() {
        //TODO
    }

    @Test
    void getDatosCliente() {
        //TODO
    }
}