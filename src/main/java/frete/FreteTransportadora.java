package frete;

public class FreteTransportadora extends FreteBase {

    public float getTaxaFixa() {
        return 50.0f;
    }

    public float getValorPorQuilo() {
        return 1.0f;
    }

    public float getValorPorKm() {
        return 0.125f;
    }
}
