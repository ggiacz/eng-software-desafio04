package frete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteSedex() {
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFrete("Sedex");
        assertEquals(80.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFretePac() {
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFrete("Pac");
        assertEquals(39.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteTransportadora() {
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFrete("Transportadora");
        assertEquals(64.5f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteRetirada() {
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFrete("Retirada");
        assertEquals(0.0f, pedido.getValorFrete());
    }

    @Test
    void deveAplicarTaxaCombustivel() {
        Configuracao.getInstance().setTaxaCombustivel(0.25f);
        Pedido pedido = new Pedido(2.0f, 100.0f);
        pedido.calcularFrete("Sedex");
        Configuracao.getInstance().setTaxaCombustivel(0.0f);
        assertEquals(100.0f, pedido.getValorFrete());
    }

    @Test
    void naoDeveCalcularFreteComPesoInvalido() {
        try {
            Pedido pedido = new Pedido(0.0f, 100.0f);
            pedido.calcularFrete("Sedex");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Peso inválido", e.getMessage());
        }
    }

    @Test
    void naoDeveCalcularFreteInexistente() {
        try {
            Pedido pedido = new Pedido(2.0f, 100.0f);
            pedido.calcularFrete("Aviao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Frete inexistente", e.getMessage());
        }
    }
}
