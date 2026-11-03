package frete;

public abstract class FreteBase implements Frete {

    public float calcular(float peso, float distancia) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso inválido");
        }
        float valor = this.getTaxaFixa() + (peso * this.getValorPorQuilo()) + (distancia * this.getValorPorKm());
        return valor * (1 + Configuracao.getInstance().getTaxaCombustivel());
    }

    public abstract float getTaxaFixa();

    public abstract float getValorPorQuilo();

    public abstract float getValorPorKm();
}
