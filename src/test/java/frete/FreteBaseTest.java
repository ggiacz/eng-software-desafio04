package frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteBaseTest {

    @Test
    void deveCalcularFreteSedexPeloTemplate() {
        FreteSedex frete = new FreteSedex();
        assertEquals(45.0f, frete.calcular(1.0f, 40.0f));
    }

    @Test
    void deveCalcularFretePacPeloTemplate() {
        FretePac frete = new FretePac();
        assertEquals(22.0f, frete.calcular(1.0f, 40.0f));
    }

    @Test
    void deveCalcularFreteTransportadoraPeloTemplate() {
        FreteTransportadora frete = new FreteTransportadora();
        assertEquals(56.0f, frete.calcular(1.0f, 40.0f));
    }

    @Test
    void deveRetornarZeroParaRetirada() {
        FreteRetirada frete = new FreteRetirada();
        assertEquals(0.0f, frete.calcular(10.0f, 500.0f));
    }

    @Test
    void naoDeveCalcularComPesoNegativo() {
        try {
            FreteSedex frete = new FreteSedex();
            frete.calcular(-1.0f, 40.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }
    }
}
