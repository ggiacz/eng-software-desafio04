package frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    void deveRetornarMesmaInstancia() {
        assertSame(Configuracao.getInstance(), Configuracao.getInstance());
    }

    @Test
    void deveRetornarNomeLoja() {
        Configuracao.getInstance().setNomeLoja("Loja 1");
        assertEquals("Loja 1", Configuracao.getInstance().getNomeLoja());
    }

    @Test
    void deveRetornarTaxaCombustivel() {
        Configuracao.getInstance().setTaxaCombustivel(0.1f);
        assertEquals(0.1f, Configuracao.getInstance().getTaxaCombustivel());
        Configuracao.getInstance().setTaxaCombustivel(0.0f);
    }
}
