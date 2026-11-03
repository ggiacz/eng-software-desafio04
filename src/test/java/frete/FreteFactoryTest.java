package frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteFactoryTest {

    @Test
    void deveRetornarFreteSedex() {
        Frete frete = FreteFactory.obterFrete("Sedex");
        assertTrue(frete instanceof FreteSedex);
    }

    @Test
    void deveRetornarFretePac() {
        Frete frete = FreteFactory.obterFrete("Pac");
        assertTrue(frete instanceof FretePac);
    }

    @Test
    void deveRetornarExcecaoParaFreteInexistente() {
        try {
            Frete frete = FreteFactory.obterFrete("Aviao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFreteAbstrato() {
        try {
            Frete frete = FreteFactory.obterFrete("Base");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaFreteInvalido() {
        try {
            Frete frete = FreteFactory.obterFrete("Drone");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inválido", e.getMessage());
        }
    }
}
