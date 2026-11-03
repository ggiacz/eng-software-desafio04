package frete;

public class Pedido {

    private float peso;
    private float distancia;
    private float valorFrete;

    public Pedido(float peso, float distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFrete(String tipo) {
        Frete frete = FreteFactory.obterFrete(tipo);
        this.valorFrete = frete.calcular(this.peso, this.distancia);
    }
}
